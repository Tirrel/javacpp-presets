// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_flann;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;

import static org.bytedeco.opencv.global.opencv_flann.*;


@Namespace("cv::flann") @Properties(inherit = org.bytedeco.opencv.presets.opencv_flann.class)
public class HierarchicalClusteringIndexParams extends IndexParams {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HierarchicalClusteringIndexParams(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public HierarchicalClusteringIndexParams(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public HierarchicalClusteringIndexParams position(long position) {
        return (HierarchicalClusteringIndexParams)super.position(position);
    }

    public HierarchicalClusteringIndexParams(int branching/*=32*/,
                          @Cast("cvflann::flann_centers_init_t") int centers_init/*=cvflann::FLANN_CENTERS_RANDOM*/, int trees/*=4*/, int leaf_size/*=100*/ ) { super((Pointer)null); allocate(branching, centers_init, trees, leaf_size); }
    private native void allocate(int branching/*=32*/,
                          @Cast("cvflann::flann_centers_init_t") int centers_init/*=cvflann::FLANN_CENTERS_RANDOM*/, int trees/*=4*/, int leaf_size/*=100*/ );
    public HierarchicalClusteringIndexParams( ) { super((Pointer)null); allocate(); }
    private native void allocate( );
}
