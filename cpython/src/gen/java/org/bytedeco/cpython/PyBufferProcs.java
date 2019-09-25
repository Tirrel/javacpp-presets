// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpython.global.python.*;


@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyBufferProcs extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyBufferProcs() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyBufferProcs(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyBufferProcs(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyBufferProcs position(long position) {
        return (PyBufferProcs)super.position(position);
    }

     public native getbufferproc bf_getbuffer(); public native PyBufferProcs bf_getbuffer(getbufferproc setter);
     public native releasebufferproc bf_releasebuffer(); public native PyBufferProcs bf_releasebuffer(releasebufferproc setter);
}