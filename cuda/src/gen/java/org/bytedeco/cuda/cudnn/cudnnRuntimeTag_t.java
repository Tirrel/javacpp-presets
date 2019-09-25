// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.cudnn.*;


/* Forward definition in this version only */
@Opaque @Properties(inherit = org.bytedeco.cuda.presets.cudnn.class)
public class cudnnRuntimeTag_t extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public cudnnRuntimeTag_t() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudnnRuntimeTag_t(Pointer p) { super(p); }
}