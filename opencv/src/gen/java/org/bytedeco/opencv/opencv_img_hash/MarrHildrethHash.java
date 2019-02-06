// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_img_hash;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.opencv.global.opencv_img_hash.*;


/** \addtogroup img_hash
 *  \{
<p>
/** \brief Marr-Hildreth Operator Based Hash, slowest but more discriminative.
<p>
See \cite zauner2010implementation for details.
*/
@Namespace("cv::img_hash") @Properties(inherit = org.bytedeco.opencv.presets.opencv_img_hash.class)
public class MarrHildrethHash extends ImgHashBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MarrHildrethHash(Pointer p) { super(p); }

    /**
     * \brief self explain
     */
    public native float getAlpha();

    /**
     * \brief self explain
     */
    public native float getScale();

    /** \brief Set Mh kernel parameters
        @param alpha int scale factor for marr wavelet (default=2).
        @param scale int level of scale factor (default = 1)
    */
    public native void setKernelParam(float alpha, float scale);

    /**
        @param alpha int scale factor for marr wavelet (default=2).
        @param scale int level of scale factor (default = 1)
    */
    public static native @Ptr MarrHildrethHash create(float alpha/*=2.0f*/, float scale/*=1.0f*/);
    public static native @Ptr MarrHildrethHash create();
}
