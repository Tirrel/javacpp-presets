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


    /**
     * \brief Derivatives of this class wraps cv::Mat for different backends and targets.
     */
    @Namespace("cv::dnn") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn.class)
public class BackendWrapper extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public BackendWrapper(Pointer p) { super(p); }
    

        /**
         * \brief Wrap cv::Mat for specific backend and target.
         * @param targetId [in] Target identifier.
         * @param m [in] cv::Mat for wrapping.
         *
         * Make CPU->GPU data transfer if it's require for the target.
         */

        /**
         * \brief Make wrapper for reused cv::Mat.
         * @param base [in] Wrapper of cv::Mat that will be reused.
         * @param shape [in] Specific shape.
         *
         * Initialize wrapper from another one. It'll wrap the same host CPU
         * memory and mustn't allocate memory on device(i.e. GPU). It might
         * has different shape. Use in case of CPU memory reusing for reuse
         * associated memory on device too.
         */

        /**
         * \brief Transfer data to CPU host memory.
         */
        public native void copyToHost();

        /**
         * \brief Indicate that an actual data is on CPU.
         */
        public native void setHostDirty();

        /** Backend identifier. */
        public native int backendId(); public native BackendWrapper backendId(int backendId);
        /** Target identifier. */
        public native int targetId(); public native BackendWrapper targetId(int targetId);
    }
