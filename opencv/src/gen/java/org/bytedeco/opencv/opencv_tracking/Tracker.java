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


/************************************ Tracker Base Class ************************************/

/** \brief Base abstract class for the long-term tracker:
 */
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_tracking.class)
public class Tracker extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Tracker(Pointer p) { super(p); }


  /** \brief Initialize the tracker with a known bounding box that surrounded the target
    @param image The initial frame
    @param boundingBox The initial bounding box
    <p>
    @return True if initialization went succesfully, false otherwise
     */
  public native @Cast("bool") boolean init( @ByVal Mat image, @Const @ByRef Rect2d boundingBox );
  public native @Cast("bool") boolean init( @ByVal UMat image, @Const @ByRef Rect2d boundingBox );
  public native @Cast("bool") boolean init( @ByVal GpuMat image, @Const @ByRef Rect2d boundingBox );

  /** \brief Update the tracker, find the new most likely bounding box for the target
    @param image The current frame
    @param boundingBox The bounding box that represent the new target location, if true was returned, not
    modified otherwise
    <p>
    @return True means that target was located and false means that tracker cannot locate target in
    current frame. Note, that latter *does not* imply that tracker has failed, maybe target is indeed
    missing from the frame (say, out of sight)
     */
  public native @Cast("bool") boolean update( @ByVal Mat image, @ByRef Rect2d boundingBox );
  public native @Cast("bool") boolean update( @ByVal UMat image, @ByRef Rect2d boundingBox );
  public native @Cast("bool") boolean update( @ByVal GpuMat image, @ByRef Rect2d boundingBox );

  public native void read( @Const @ByRef FileNode fn );
  public native void write( @ByRef FileStorage fs );
}
