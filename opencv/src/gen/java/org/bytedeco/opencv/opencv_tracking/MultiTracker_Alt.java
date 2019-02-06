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


/************************************ Multi-Tracker Classes ---By Tyan Vladimir---************************************/

/** \brief Base abstract class for the long-term Multi Object Trackers:
<p>
@see Tracker, MultiTrackerTLD
*/
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_tracking.class)
public class MultiTracker_Alt extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MultiTracker_Alt(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MultiTracker_Alt(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public MultiTracker_Alt position(long position) {
        return (MultiTracker_Alt)super.position(position);
    }

  /** \brief Constructor for Multitracker
  */
  public MultiTracker_Alt() { super((Pointer)null); allocate(); }
  private native void allocate();

  /** \brief Add a new target to a tracking-list and initialize the tracker with a known bounding box that surrounded the target
  @param image The initial frame
  @param boundingBox The initial bounding box of target
  @param tracker_algorithm Multi-tracker algorithm
  <p>
  @return True if new target initialization went succesfully, false otherwise
  */
  public native @Cast("bool") boolean addTarget(@ByVal Mat image, @Const @ByRef Rect2d boundingBox, @Ptr @ByVal Tracker tracker_algorithm);
  public native @Cast("bool") boolean addTarget(@ByVal UMat image, @Const @ByRef Rect2d boundingBox, @Ptr @ByVal Tracker tracker_algorithm);
  public native @Cast("bool") boolean addTarget(@ByVal GpuMat image, @Const @ByRef Rect2d boundingBox, @Ptr @ByVal Tracker tracker_algorithm);

  /** \brief Update all trackers from the tracking-list, find a new most likely bounding boxes for the targets
  @param image The current frame
  <p>
  @return True means that all targets were located and false means that tracker couldn't locate one of the targets in
  current frame. Note, that latter *does not* imply that tracker has failed, maybe target is indeed
  missing from the frame (say, out of sight)
  */
  public native @Cast("bool") boolean update(@ByVal Mat image);
  public native @Cast("bool") boolean update(@ByVal UMat image);
  public native @Cast("bool") boolean update(@ByVal GpuMat image);

  /** \brief Current number of targets in tracking-list
  */
  public native int targetNum(); public native MultiTracker_Alt targetNum(int targetNum);

  /** \brief Trackers list for Multi-Object-Tracker
  */
  public native @ByRef TrackerVector trackers(); public native MultiTracker_Alt trackers(TrackerVector trackers);

  /** \brief Bounding Boxes list for Multi-Object-Tracker
  */
  public native @ByRef Rect2dVector boundingBoxes(); public native MultiTracker_Alt boundingBoxes(Rect2dVector boundingBoxes);
  /** \brief List of randomly generated colors for bounding boxes display
  */
  public native @ByRef ScalarVector colors(); public native MultiTracker_Alt colors(ScalarVector colors);
}
