// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Allocator;
import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;

@Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class onnxSignalEventFunction extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    onnxSignalEventFunction(Pointer p) { super(p); }
    protected onnxSignalEventFunction() { allocate(); }
    private native void allocate();
    public native @Cast("onnxStatus") int call(
    onnxEvent event);
}