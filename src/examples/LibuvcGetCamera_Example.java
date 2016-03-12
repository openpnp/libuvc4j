package examples;

import org.bridj.Pointer;
import org.openpnp.libuvc4j.UvcLibrary;
import org.openpnp.libuvc4j.UvcLibrary.libusb_context;
import org.openpnp.libuvc4j.UvcLibrary.uvc_context;
import org.openpnp.libuvc4j.UvcLibrary.uvc_device;
import org.openpnp.libuvc4j.UvcLibrary.uvc_device_handle;
import org.openpnp.libuvc4j.UvcLibrary.uvc_error;

public class LibuvcGetCamera_Example {

	private static int cameraID = 0;
	private static Pointer<Pointer<uvc_context>> ctx;
	private static Pointer<libusb_context> usb_ctx = null;
	
	private static void initUVC() throws Exception{
		ctx = Pointer.allocatePointer(uvc_context.class);
		//usb_ctx = Pointer.allocate(libusb_context.class);
		if (UvcLibrary.uvc_init(ctx, usb_ctx) != uvc_error.UVC_SUCCESS) 
			throw new Exception("Exception in initUVC: Initialization of UVC failed");
		System.out.println("UVC Initialized");
	}

	private static Pointer<uvc_device> openUVCDevice(int cameraID) throws Exception {
		Pointer<Pointer<Pointer<uvc_device>>> devList = Pointer.allocatePointerPointer(uvc_device.class);
		if (UvcLibrary.uvc_get_device_list(ctx.get(), devList) != uvc_error.UVC_SUCCESS)
			throw new Exception("Exception in openUVCDevice: no valid devicelist found");
		int nDevs=0;
		while (devList.get().get(nDevs) != null)
			nDevs++;
		System.out.println("N Cameras: " + nDevs);
		if (nDevs-1<cameraID)
			throw new Exception("Exception in openUVCDevice: no camera with ID " + cameraID + " found");
		System.out.println("Opening device ID: " + cameraID);
		return devList.get().get(cameraID);
	}

	public static void main(String[] args) {
		try {
			initUVC();
			Pointer<uvc_device> dev = openUVCDevice(cameraID);
			Pointer<Pointer<uvc_device_handle>> devh = Pointer.allocatePointer(uvc_device_handle.class);
			if (UvcLibrary.uvc_open(dev, devh) != uvc_error.UVC_SUCCESS)
				throw new Exception("Exception in UVCDeviceManager.listUVCCameraDetails: no handle acquired");
			UvcLibrary.uvc_print_diag(devh.get(),null);
			UvcLibrary.uvc_close(devh.get());
			UvcLibrary.uvc_unref_device(dev);		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
