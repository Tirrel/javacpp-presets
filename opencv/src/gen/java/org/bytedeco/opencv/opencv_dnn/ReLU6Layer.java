// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_dnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.opencv.global.opencv_dnn.*;


    @Namespace("cv::dnn") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn.class)
public class ReLU6Layer extends ActivationLayer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public ReLU6Layer(Pointer p) { super(p); }
    
        public native float minValue(); public native ReLU6Layer minValue(float setter);
        public native float maxValue(); public native ReLU6Layer maxValue(float setter);

        public static native @Ptr ReLU6Layer create(@Const @ByRef LayerParams params);
    }