// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nppc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nppc.*;

    
/** 
 * NPP stream context structure must be filled in by application. 
 * Application should not initialize or alter reserved fields. 
 * 
 */
@Properties(inherit = org.bytedeco.cuda.presets.nppc.class)
public class NppStreamContext extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NppStreamContext() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NppStreamContext(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NppStreamContext(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NppStreamContext position(long position) {
        return (NppStreamContext)super.position(position);
    }

    public native CUstream_st hStream(); public native NppStreamContext hStream(CUstream_st hStream);
    public native int nCudaDeviceId(); public native NppStreamContext nCudaDeviceId(int nCudaDeviceId); /* From cudaGetDevice() */
    public native int nMultiProcessorCount(); public native NppStreamContext nMultiProcessorCount(int nMultiProcessorCount); /* From cudaGetDeviceProperties() */
    public native int nMaxThreadsPerMultiProcessor(); public native NppStreamContext nMaxThreadsPerMultiProcessor(int nMaxThreadsPerMultiProcessor); /* From cudaGetDeviceProperties() */
    public native int nMaxThreadsPerBlock(); public native NppStreamContext nMaxThreadsPerBlock(int nMaxThreadsPerBlock); /* From cudaGetDeviceProperties() */
    public native @Cast("size_t") long nSharedMemPerBlock(); public native NppStreamContext nSharedMemPerBlock(long nSharedMemPerBlock); /* From cudaGetDeviceProperties */
    public native int nCudaDevAttrComputeCapabilityMajor(); public native NppStreamContext nCudaDevAttrComputeCapabilityMajor(int nCudaDevAttrComputeCapabilityMajor); /* From cudaGetDeviceAttribute() */
    public native int nCudaDevAttrComputeCapabilityMinor(); public native NppStreamContext nCudaDevAttrComputeCapabilityMinor(int nCudaDevAttrComputeCapabilityMinor); /* From cudaGetDeviceAttribute() */
    public native int nReserved0(); public native NppStreamContext nReserved0(int nReserved0);
    public native int nReserved1(); public native NppStreamContext nReserved1(int nReserved1);
}