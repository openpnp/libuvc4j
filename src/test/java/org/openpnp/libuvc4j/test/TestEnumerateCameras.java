package org.openpnp.libuvc4j.test;

import org.bridj.Pointer;
import org.junit.Test;
import org.openpnp.libuvc4j.UvcLibrary;
import org.openpnp.libuvc4j.UvcLibrary.uvc_context;
import org.openpnp.libuvc4j.UvcLibrary.uvc_device;
import org.openpnp.libuvc4j.uvc_device_descriptor;

public class TestEnumerateCameras {
	@Test
	public void test() {
		Pointer<Pointer<uvc_context>> ctx = Pointer.allocatePointer(uvc_context.class);
		System.out.println("uvc_init " + UvcLibrary.uvc_init(ctx, null));
		Pointer<Pointer<Pointer<uvc_device>>> devList = Pointer.allocatePointerPointer(uvc_device.class);
		System.out.println("uvc_get_device_list " + UvcLibrary.uvc_get_device_list(ctx.get(), devList));
		for (Pointer<uvc_device> dev : devList.get()) {
			if (dev == null) {
				break;
			}
			byte busNumber = UvcLibrary.uvc_get_bus_number(dev);
			byte devAddress = UvcLibrary.uvc_get_device_address(dev);
			System.out.println(busNumber + " " + devAddress);
			Pointer<Pointer<uvc_device_descriptor>> desc = Pointer.allocatePointer(uvc_device_descriptor.class);
			System.out.println("uvc_get_device_descriptor " + UvcLibrary.uvc_get_device_descriptor(dev, desc));
			System.out.println("  Vendor ID: " + String.format("0x%04x",desc.get().get().idVendor()));
			System.out.println("  Product ID: " + String.format("0x%04x",desc.get().get().idProduct()));
			System.out.println("  Manufacturer " + getString(desc.get().get().manufacturer()));
			System.out.println("  Product " + getString(desc.get().get().product()));
			System.out.println("  Serial " + getString(desc.get().get().serialNumber()));
			UvcLibrary.uvc_free_device_descriptor(desc.get());
		}
		UvcLibrary.uvc_free_device_list(devList.get(), (byte) 1);
	}
	
	public static String getString(Pointer<Byte> p) {
		if (p == null) {
			return null;
		}
		return p.getCString();
	}
}
