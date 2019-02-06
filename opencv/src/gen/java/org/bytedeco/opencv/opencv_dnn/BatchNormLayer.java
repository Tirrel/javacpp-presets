// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_dnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.opencv.global.opencv_dnn.*;


    @Namespace("cv::dnn") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn.class)
public class BatchNormLayer extends ActivationLayer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public BatchNormLayer(Pointer p) { super(p); }
    
        public native @Cast("bool") boolean hasWeights(); public native BatchNormLayer hasWeights(boolean hasWeights);
        public native @Cast("bool") boolean hasBias(); public native BatchNormLayer hasBias(boolean hasBias);
        public native float epsilon(); public native BatchNormLayer epsilon(float epsilon);

        public static native @Ptr BatchNormLayer create(@Const @ByRef LayerParams params);
    }
