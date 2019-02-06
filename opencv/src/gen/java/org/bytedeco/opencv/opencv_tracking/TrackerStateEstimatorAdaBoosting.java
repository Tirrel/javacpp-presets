// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_tracking;

import org.bytedeco.javacpp.annotation.Index;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import org.bytedeco.opencv.opencv_plot.*;
import static org.bytedeco.opencv.global.opencv_plot.*;
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
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;

import static org.bytedeco.opencv.global.opencv_tracking.*;


/** \brief TrackerStateEstimatorAdaBoosting based on ADA-Boosting
 */
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_tracking.class)
public class TrackerStateEstimatorAdaBoosting extends TrackerStateEstimator {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TrackerStateEstimatorAdaBoosting(Pointer p) { super(p); }

  /** \brief Implementation of the target state for TrackerAdaBoostingTargetState
    */
  @NoOffset public static class TrackerAdaBoostingTargetState extends TrackerTargetState {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public TrackerAdaBoostingTargetState(Pointer p) { super(p); }
  
    /**
     * \brief Constructor
     * @param position Top left corner of the bounding box
     * @param width Width of the bounding box
     * @param height Height of the bounding box
     * @param foreground label for target or background
     * @param responses list of features
     */
    public TrackerAdaBoostingTargetState( @Const @ByRef Point2f position, int width, int height, @Cast("bool") boolean foreground, @Const @ByRef Mat responses ) { super((Pointer)null); allocate(position, width, height, foreground, responses); }
    private native void allocate( @Const @ByRef Point2f position, int width, int height, @Cast("bool") boolean foreground, @Const @ByRef Mat responses );

    /**
     * \brief Destructor
     */

    /** \brief Set the features extracted from TrackerFeatureSet
    @param responses The features extracted
     */
    public native void setTargetResponses( @Const @ByRef Mat responses );
    /** \brief Set label: true for target foreground, false for background
    @param foreground Label for background/foreground
     */
    public native void setTargetFg( @Cast("bool") boolean foreground );
    /** \brief Get the features extracted
     */
    public native @ByVal Mat getTargetResponses();
    /** \brief Get the label. Return true for target foreground, false for background
    */
    public native @Cast("bool") boolean isTargetFg();

  }

  /** \brief Constructor
    @param numClassifer Number of base classifiers
    @param initIterations Number of iterations in the initialization
    @param nFeatures Number of features/weak classifiers
    @param patchSize tracking rect
    @param ROI initial ROI
     */
  public TrackerStateEstimatorAdaBoosting( int numClassifer, int initIterations, int nFeatures, @ByVal Size patchSize, @Const @ByRef Rect ROI ) { super((Pointer)null); allocate(numClassifer, initIterations, nFeatures, patchSize, ROI); }
  private native void allocate( int numClassifer, int initIterations, int nFeatures, @ByVal Size patchSize, @Const @ByRef Rect ROI );

  /**
   * \brief Destructor
   */

  /** \brief Get the sampling ROI
     */
  public native @ByVal Rect getSampleROI();

  /** \brief Set the sampling ROI
    @param ROI the sampling ROI
     */
  public native void setSampleROI( @Const @ByRef Rect ROI );

  /** \brief Set the current confidenceMap
    @param confidenceMap The current :cConfidenceMap
     */
  public native void setCurrentConfidenceMap( @ByRef ConfidenceMap confidenceMap );

  /** \brief Get the list of the selected weak classifiers for the classification step
     */
  public native @StdVector IntPointer computeSelectedWeakClassifier();

  /** \brief Get the list of the weak classifiers that should be replaced
     */
  public native @StdVector IntPointer computeReplacedClassifier();

  /** \brief Get the list of the weak classifiers that replace those to be replaced
     */
  public native @StdVector IntPointer computeSwappedClassifier();
}
