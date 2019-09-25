// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class Permutation extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Permutation() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Permutation(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Permutation(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Permutation position(long position) {
        return (Permutation)super.position(position);
    }

    /**
     *  The elements of the permutation.
     *  The permutation is applied as outputDimensionIndex = permutation.order[inputDimensionIndex], so to
     *  permute from CHW order to HWC order, the required permutation is [1, 2, 0], and to permute
     *  from HWC to CHW, the required permutation is [2, 0, 1].
     *  */
    public native int order(int i); public native Permutation order(int i, int setter);
    @MemberGetter public native IntPointer order();
}