// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_features2d;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;

import static org.bytedeco.opencv.global.opencv_features2d.*;


/** \} features2d_main
<p>
/****************************************************************************************\
*                                      Distance                                          *
\****************************************************************************************/

@Name("cv::Accumulator<unsigned char>") @Properties(inherit = org.bytedeco.opencv.presets.opencv_features2d.class)
public class Accumulator extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Accumulator() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Accumulator(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Accumulator(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Accumulator position(long position) {
        return (Accumulator)super.position(position);
    }
 }
