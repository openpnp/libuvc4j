package org.openpnp.libuvc4j;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : /usr/local/Cellar/libuvc/HEAD/include/libuvc/libuvc.h:250</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("uvc") 
public class uvc_output_terminal extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : uvc_output_terminal* */
	@Field(0) 
	public Pointer<uvc_output_terminal > prev() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : uvc_output_terminal* */
	@Field(0) 
	public uvc_output_terminal prev(Pointer<uvc_output_terminal > prev) {
		this.io.setPointerField(this, 0, prev);
		return this;
	}
	/** C type : uvc_output_terminal* */
	@Field(1) 
	public Pointer<uvc_output_terminal > next() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : uvc_output_terminal* */
	@Field(1) 
	public uvc_output_terminal next(Pointer<uvc_output_terminal > next) {
		this.io.setPointerField(this, 1, next);
		return this;
	}
	public uvc_output_terminal() {
		super();
	}
	public uvc_output_terminal(Pointer pointer) {
		super(pointer);
	}
}
