// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.opencv.global.opencv_core.*;



/*********************************** Sequence *******************************************/

@Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class CvSeqBlock extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvSeqBlock() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvSeqBlock(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvSeqBlock(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CvSeqBlock position(long position) {
        return (CvSeqBlock)super.position(position);
    }

    /** Previous sequence block.                   */
    public native CvSeqBlock prev(); public native CvSeqBlock prev(CvSeqBlock prev);
    /** Next sequence block.                       */
    public native CvSeqBlock next(); public native CvSeqBlock next(CvSeqBlock next);
    /** Index of the first element in the block +  */
    /** sequence->first->start_index.              */
    public native int start_index(); public native CvSeqBlock start_index(int start_index);
    /** Number of elements in the block.           */
    public native int count(); public native CvSeqBlock count(int count);
    /** Pointer to the first element of the block. */
    public native @Cast("schar*") BytePointer data(); public native CvSeqBlock data(BytePointer data);
}
