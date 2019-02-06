// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.opencv.global.opencv_core.*;


@Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class CvSeqWriter extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvSeqWriter() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvSeqWriter(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvSeqWriter(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CvSeqWriter position(long position) {
        return (CvSeqWriter)super.position(position);
    }

    public native int header_size(); public native CvSeqWriter header_size(int header_size);
    /** the sequence written */
    public native CvSeq seq(); public native CvSeqWriter seq(CvSeq seq);
    /** current block */
    public native CvSeqBlock block(); public native CvSeqWriter block(CvSeqBlock block);
    /** pointer to free space */
    public native @Cast("schar*") BytePointer ptr(); public native CvSeqWriter ptr(BytePointer ptr);
    /** pointer to the beginning of block*/
    public native @Cast("schar*") BytePointer block_min(); public native CvSeqWriter block_min(BytePointer block_min);
    /** pointer to the end of block */
    public native @Cast("schar*") BytePointer block_max(); public native CvSeqWriter block_max(BytePointer block_max);
}
