package org.openpnp.libuvc4j;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Union;
import org.openpnp.libuvc4j.UvcLibrary.uvc_streaming_interface;
import org.openpnp.libuvc4j.UvcLibrary.uvc_vs_desc_subtype;
/**
 * <i>native declaration : /usr/local/Cellar/libuvc/HEAD/include/libuvc/libuvc.h:119</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("uvc") 
public class uvc_format_desc extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : uvc_streaming_interface* */
	@Field(0) 
	public Pointer<uvc_streaming_interface > parent() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : uvc_streaming_interface* */
	@Field(0) 
	public uvc_format_desc parent(Pointer<uvc_streaming_interface > parent) {
		this.io.setPointerField(this, 0, parent);
		return this;
	}
	/** C type : uvc_format_desc* */
	@Field(1) 
	public Pointer<uvc_format_desc > prev() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : uvc_format_desc* */
	@Field(1) 
	public uvc_format_desc prev(Pointer<uvc_format_desc > prev) {
		this.io.setPointerField(this, 1, prev);
		return this;
	}
	/** C type : uvc_format_desc* */
	@Field(2) 
	public Pointer<uvc_format_desc > next() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : uvc_format_desc* */
	@Field(2) 
	public uvc_format_desc next(Pointer<uvc_format_desc > next) {
		this.io.setPointerField(this, 2, next);
		return this;
	}
	/** C type : uvc_vs_desc_subtype */
	@Field(3) 
	public IntValuedEnum<uvc_vs_desc_subtype > bDescriptorSubtype() {
		return this.io.getEnumField(this, 3);
	}
	/** C type : uvc_vs_desc_subtype */
	@Field(3) 
	public uvc_format_desc bDescriptorSubtype(IntValuedEnum<uvc_vs_desc_subtype > bDescriptorSubtype) {
		this.io.setEnumField(this, 3, bDescriptorSubtype);
		return this;
	}
	@Field(4) 
	public byte bFormatIndex() {
		return this.io.getByteField(this, 4);
	}
	@Field(4) 
	public uvc_format_desc bFormatIndex(byte bFormatIndex) {
		this.io.setByteField(this, 4, bFormatIndex);
		return this;
	}
	@Field(5) 
	public byte bNumFrameDescriptors() {
		return this.io.getByteField(this, 5);
	}
	@Field(5) 
	public uvc_format_desc bNumFrameDescriptors(byte bNumFrameDescriptors) {
		this.io.setByteField(this, 5, bNumFrameDescriptors);
		return this;
	}
	/** C type : field1_union */
	@Field(6) 
	public uvc_format_desc.field1_union field1() {
		return this.io.getNativeObjectField(this, 6);
	}
	/** C type : field1_union */
	@Field(6) 
	public uvc_format_desc field1(uvc_format_desc.field1_union field1) {
		this.io.setNativeObjectField(this, 6, field1);
		return this;
	}
	/** C type : field2_union */
	@Field(7) 
	public uvc_format_desc.field2_union field2() {
		return this.io.getNativeObjectField(this, 7);
	}
	/** C type : field2_union */
	@Field(7) 
	public uvc_format_desc field2(uvc_format_desc.field2_union field2) {
		this.io.setNativeObjectField(this, 7, field2);
		return this;
	}
	@Field(8) 
	public byte bDefaultFrameIndex() {
		return this.io.getByteField(this, 8);
	}
	@Field(8) 
	public uvc_format_desc bDefaultFrameIndex(byte bDefaultFrameIndex) {
		this.io.setByteField(this, 8, bDefaultFrameIndex);
		return this;
	}
	@Field(9) 
	public byte bAspectRatioX() {
		return this.io.getByteField(this, 9);
	}
	@Field(9) 
	public uvc_format_desc bAspectRatioX(byte bAspectRatioX) {
		this.io.setByteField(this, 9, bAspectRatioX);
		return this;
	}
	@Field(10) 
	public byte bAspectRatioY() {
		return this.io.getByteField(this, 10);
	}
	@Field(10) 
	public uvc_format_desc bAspectRatioY(byte bAspectRatioY) {
		this.io.setByteField(this, 10, bAspectRatioY);
		return this;
	}
	@Field(11) 
	public byte bmInterlaceFlags() {
		return this.io.getByteField(this, 11);
	}
	@Field(11) 
	public uvc_format_desc bmInterlaceFlags(byte bmInterlaceFlags) {
		this.io.setByteField(this, 11, bmInterlaceFlags);
		return this;
	}
	@Field(12) 
	public byte bCopyProtect() {
		return this.io.getByteField(this, 12);
	}
	@Field(12) 
	public uvc_format_desc bCopyProtect(byte bCopyProtect) {
		this.io.setByteField(this, 12, bCopyProtect);
		return this;
	}
	@Field(13) 
	public byte bVariableSize() {
		return this.io.getByteField(this, 13);
	}
	@Field(13) 
	public uvc_format_desc bVariableSize(byte bVariableSize) {
		this.io.setByteField(this, 13, bVariableSize);
		return this;
	}
	/** C type : uvc_frame_desc* */
	@Field(14) 
	public Pointer<uvc_frame_desc > frame_descs() {
		return this.io.getPointerField(this, 14);
	}
	/** C type : uvc_frame_desc* */
	@Field(14) 
	public uvc_format_desc frame_descs(Pointer<uvc_frame_desc > frame_descs) {
		this.io.setPointerField(this, 14, frame_descs);
		return this;
	}
	/** <i>native declaration : /usr/local/Cellar/libuvc/HEAD/include/libuvc/libuvc.h:114</i> */
	@Union 
	public static class field1_union extends StructObject {
		static {
			BridJ.register();
		}
		/** C type : uint8_t[16] */
		@Array({16}) 
		@Field(0) 
		public Pointer<Byte > guidFormat() {
			return this.io.getPointerField(this, 0);
		}
		/** C type : uint8_t[4] */
		@Array({4}) 
		@Field(1) 
		public Pointer<Byte > fourccFormat() {
			return this.io.getPointerField(this, 1);
		}
		public field1_union() {
			super();
		}
		public field1_union(Pointer pointer) {
			super(pointer);
		}
	};
	/** <i>native declaration : /usr/local/Cellar/libuvc/HEAD/include/libuvc/libuvc.h:118</i> */
	@Union 
	public static class field2_union extends StructObject {
		static {
			BridJ.register();
		}
		@Field(0) 
		public byte bBitsPerPixel() {
			return this.io.getByteField(this, 0);
		}
		@Field(0) 
		public field2_union bBitsPerPixel(byte bBitsPerPixel) {
			this.io.setByteField(this, 0, bBitsPerPixel);
			return this;
		}
		@Field(1) 
		public byte bmFlags() {
			return this.io.getByteField(this, 1);
		}
		@Field(1) 
		public field2_union bmFlags(byte bmFlags) {
			this.io.setByteField(this, 1, bmFlags);
			return this;
		}
		public field2_union() {
			super();
		}
		public field2_union(Pointer pointer) {
			super(pointer);
		}
	};
	public uvc_format_desc() {
		super();
	}
	public uvc_format_desc(Pointer pointer) {
		super(pointer);
	}
}
