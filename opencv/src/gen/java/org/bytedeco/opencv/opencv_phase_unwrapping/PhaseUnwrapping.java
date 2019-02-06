// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_phase_unwrapping;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.opencv.global.opencv_phase_unwrapping.*;

/** \addtogroup phase_unwrapping
 *  \{
    <p>
    /**
     \brief Abstract base class for phase unwrapping.
    */
@Namespace("cv::phase_unwrapping") @Properties(inherit = org.bytedeco.opencv.presets.opencv_phase_unwrapping.class)
public class PhaseUnwrapping extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PhaseUnwrapping(Pointer p) { super(p); }

    /**
     * \brief Unwraps a 2D phase map.
     <p>
     * @param wrappedPhaseMap The wrapped phase map that needs to be unwrapped.
     * @param unwrappedPhaseMap The unwrapped phase map.
     * @param shadowMask Optional parameter used when some pixels do not hold any phase information in the wrapped phase map.
     */
    public native void unwrapPhaseMap( @ByVal Mat wrappedPhaseMap, @ByVal Mat unwrappedPhaseMap,
                                     @ByVal(nullValue = "cv::InputArray(cv::noArray())") Mat shadowMask );
    public native void unwrapPhaseMap( @ByVal Mat wrappedPhaseMap, @ByVal Mat unwrappedPhaseMap );
    public native void unwrapPhaseMap( @ByVal UMat wrappedPhaseMap, @ByVal UMat unwrappedPhaseMap,
                                     @ByVal(nullValue = "cv::InputArray(cv::noArray())") UMat shadowMask );
    public native void unwrapPhaseMap( @ByVal UMat wrappedPhaseMap, @ByVal UMat unwrappedPhaseMap );
    public native void unwrapPhaseMap( @ByVal GpuMat wrappedPhaseMap, @ByVal GpuMat unwrappedPhaseMap,
                                     @ByVal(nullValue = "cv::InputArray(cv::noArray())") GpuMat shadowMask );
    public native void unwrapPhaseMap( @ByVal GpuMat wrappedPhaseMap, @ByVal GpuMat unwrappedPhaseMap );

}
