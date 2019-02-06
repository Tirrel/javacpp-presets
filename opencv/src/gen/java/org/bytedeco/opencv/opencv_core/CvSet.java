// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.opencv.global.opencv_core.*;


@Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class CvSet extends AbstractCvSet {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvSet() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvSet(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvSet(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CvSet position(long position) {
        return (CvSet)super.position(position);
    }

    /** Miscellaneous flags.     */
    public native int flags(); public native CvSet flags(int flags);
    /** Size of sequence header. */
    public native int header_size(); public native CvSet header_size(int header_size);
    /** Previous sequence.       */
    public native CvSeq h_prev(); public native CvSet h_prev(CvSeq h_prev);
    /** Next sequence.           */
    public native CvSeq h_next(); public native CvSet h_next(CvSeq h_next);
    /** 2nd previous sequence.   */
    public native CvSeq v_prev(); public native CvSet v_prev(CvSeq v_prev);
    public native CvSeq v_next(); public native CvSet v_next(CvSeq v_next);
    /** Total number of elements.            */
    public native int total(); public native CvSet total(int total);
    /** Size of sequence element in bytes.   */
    public native int elem_size(); public native CvSet elem_size(int elem_size);
    /** Maximal bound of the last block.     */
    public native @Cast("schar*") BytePointer block_max(); public native CvSet block_max(BytePointer block_max);
    /** Current write pointer.               */
    public native @Cast("schar*") BytePointer ptr(); public native CvSet ptr(BytePointer ptr);
    /** Grow seq this many at a time.        */
    public native int delta_elems(); public native CvSet delta_elems(int delta_elems);
    /** Where the seq is stored.             */
    public native CvMemStorage storage(); public native CvSet storage(CvMemStorage storage);
    /** Free blocks list.                    */
    public native CvSeqBlock free_blocks(); public native CvSet free_blocks(CvSeqBlock free_blocks);
    /** Pointer to the first sequence block. */
    public native CvSeqBlock first(); public native CvSet first(CvSeqBlock first);
    public native CvSetElem free_elems(); public native CvSet free_elems(CvSetElem free_elems);
    public native int active_count(); public native CvSet active_count(int active_count);
}
