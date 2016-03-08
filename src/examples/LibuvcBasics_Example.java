package examples;

import org.bridj.Pointer;
import org.openpnp.libuvc4j.UvcLibrary;
import org.openpnp.libuvc4j.uvc_device_descriptor;
import org.openpnp.libuvc4j.UvcLibrary.uvc_context;
import org.openpnp.libuvc4j.UvcLibrary.uvc_device;
import org.openpnp.libuvc4j.UvcLibrary.uvc_error;

public class LibuvcBasics_Example {

	static private Pointer<Pointer<uvc_context>> ctx;
	
	private static String getString(Pointer<Byte> p) {
		if (p == null) return null;
		return p.getCString();
	}

	public static void main(String[] args) {
		try {
			ctx = Pointer.allocatePointer(uvc_context.class);
			if (UvcLibrary.uvc_init(ctx, null) != uvc_error.UVC_SUCCESS)
				throw new Exception("Exception: uvccontext init - no good");
			Pointer<Pointer<Pointer<uvc_device>>> devList = Pointer.allocatePointerPointer(uvc_device.class);
			if (UvcLibrary.uvc_get_device_list(ctx.get(), devList) != uvc_error.UVC_SUCCESS)
				throw new Exception("Exception: device list - no good");
			int camCounter = 0;
			for (Pointer<uvc_device> dev : devList.get()) {
				if (dev == null)
					break;
				byte busNumber = UvcLibrary.uvc_get_bus_number(dev);
				byte devAddress = UvcLibrary.uvc_get_device_address(dev);
				System.out.println("Camera: " + ++camCounter);
				Pointer<Pointer<uvc_device_descriptor>> desc = Pointer.allocatePointer(uvc_device_descriptor.class);
				if (UvcLibrary.uvc_get_device_descriptor(dev, desc) != uvc_error.UVC_SUCCESS)
					throw new Exception("Exception: device descriptor - no good");
				String vendorId = String.format("0x%04x",desc.get().get().idVendor());
				String productId = String.format("0x%04x",desc.get().get().idProduct());
				String manufacturer = getString(desc.get().get().manufacturer());
				String product = getString(desc.get().get().product());
				String serial = getString(desc.get().get().serialNumber());
				System.out.println("   Bus: " + busNumber + ":" + devAddress);
				System.out.println("   IDs: " + vendorId + ":" + productId);
				System.out.println("  Manu: " + manufacturer);
				System.out.println("  Prod: " + product);
				System.out.println("  Ser#: " + serial);
				System.out.println();
				UvcLibrary.uvc_free_device_descriptor(desc.get());
			}
			UvcLibrary.uvc_free_device_list(devList.get(),(byte)1);
		} catch(Exception e) { e.printStackTrace(); }
	}
}
