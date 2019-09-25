// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_bgsegm;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
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
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;

import static org.bytedeco.opencv.global.opencv_bgsegm.*;


/** \addtogroup bgsegm
 *  \{
<p>
/** \brief Gaussian Mixture-based Background/Foreground Segmentation Algorithm.
<p>
The class implements the algorithm described in \cite KB2001 .
 */
@Namespace("cv::bgsegm") @Properties(inherit = org.bytedeco.opencv.presets.opencv_bgsegm.class)
public class BackgroundSubtractorMOG extends BackgroundSubtractor {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BackgroundSubtractorMOG(Pointer p) { super(p); }

    public native int getHistory();
    public native void setHistory(int nframes);

    public native int getNMixtures();
    public native void setNMixtures(int nmix);

    public native double getBackgroundRatio();
    public native void setBackgroundRatio(double backgroundRatio);

    public native double getNoiseSigma();
    public native void setNoiseSigma(double noiseSigma);
}