// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvgraph;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvgraph.*;


/* Opaque structure holding nvGRAPH library context */
@Opaque @Properties(inherit = org.bytedeco.cuda.presets.nvgraph.class)
public class nvgraphContext extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public nvgraphContext() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvgraphContext(Pointer p) { super(p); }
}