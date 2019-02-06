// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.opencv.global.opencv_core.*;


@Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class IplConvKernelFP extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IplConvKernelFP() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IplConvKernelFP(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IplConvKernelFP(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IplConvKernelFP position(long position) {
        return (IplConvKernelFP)super.position(position);
    }

    public native int nCols(); public native IplConvKernelFP nCols(int nCols);
    public native int nRows(); public native IplConvKernelFP nRows(int nRows);
    public native int anchorX(); public native IplConvKernelFP anchorX(int anchorX);
    public native int anchorY(); public native IplConvKernelFP anchorY(int anchorY);
    public native FloatPointer values(); public native IplConvKernelFP values(FloatPointer values);
}
