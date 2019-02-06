// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_face;

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
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_objdetect.*;
import static org.bytedeco.opencv.global.opencv_objdetect.*;
import org.bytedeco.opencv.opencv_photo.*;
import static org.bytedeco.opencv.global.opencv_photo.*;

import static org.bytedeco.opencv.global.opencv_face.*;


@Namespace("cv::face") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_face.class)
public class CParams extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CParams(Pointer p) { super(p); }

    /**  the face detector */
    public native @Str BytePointer cascade(); public native CParams cascade(BytePointer cascade);
    /** Parameter specifying how much the image size is reduced at each image scale. */
    public native double scaleFactor(); public native CParams scaleFactor(double scaleFactor);
    /** Parameter specifying how many neighbors each candidate rectangle should have to retain it. */
    public native int minNeighbors(); public native CParams minNeighbors(int minNeighbors);
    /** Minimum possible object size. */
    public native @ByRef Size minSize(); public native CParams minSize(Size minSize);
    /** Maximum possible object size. */
    public native @ByRef Size maxSize(); public native CParams maxSize(Size maxSize);

    public CParams(
            @Str BytePointer cascade_model,
            double sf/*=1.1*/,
            int minN/*=3*/,
            @ByVal(nullValue = "cv::Size(30, 30)") Size minSz,
            @ByVal(nullValue = "cv::Size()") Size maxSz
        ) { super((Pointer)null); allocate(cascade_model, sf, minN, minSz, maxSz); }
    private native void allocate(
            @Str BytePointer cascade_model,
            double sf/*=1.1*/,
            int minN/*=3*/,
            @ByVal(nullValue = "cv::Size(30, 30)") Size minSz,
            @ByVal(nullValue = "cv::Size()") Size maxSz
        );
    public CParams(
            @Str BytePointer cascade_model
        ) { super((Pointer)null); allocate(cascade_model); }
    private native void allocate(
            @Str BytePointer cascade_model
        );
    public CParams(
            @Str String cascade_model,
            double sf/*=1.1*/,
            int minN/*=3*/,
            @ByVal(nullValue = "cv::Size(30, 30)") Size minSz,
            @ByVal(nullValue = "cv::Size()") Size maxSz
        ) { super((Pointer)null); allocate(cascade_model, sf, minN, minSz, maxSz); }
    private native void allocate(
            @Str String cascade_model,
            double sf/*=1.1*/,
            int minN/*=3*/,
            @ByVal(nullValue = "cv::Size(30, 30)") Size minSz,
            @ByVal(nullValue = "cv::Size()") Size maxSz
        );
    public CParams(
            @Str String cascade_model
        ) { super((Pointer)null); allocate(cascade_model); }
    private native void allocate(
            @Str String cascade_model
        );

    public native @ByRef CascadeClassifier face_cascade(); public native CParams face_cascade(CascadeClassifier face_cascade);
}
