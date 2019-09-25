// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.hdf5.global.hdf5.*;

// #endif

/* Information struct for attribute (for H5Aget_info/H5Aget_info_by_idx) */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5A_info_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public H5A_info_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public H5A_info_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public H5A_info_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public H5A_info_t position(long position) {
        return (H5A_info_t)super.position(position);
    }

    public native @Cast("hbool_t") boolean corder_valid(); public native H5A_info_t corder_valid(boolean setter);   /* Indicate if creation order is valid */
    public native @Cast("H5O_msg_crt_idx_t") int corder(); public native H5A_info_t corder(int setter);         /* Creation order                 */
    public native @Cast("H5T_cset_t") int cset(); public native H5A_info_t cset(int setter);           /* Character set of attribute name */
    public native @Cast("hsize_t") long data_size(); public native H5A_info_t data_size(long setter);      /* Size of raw data		  */
}