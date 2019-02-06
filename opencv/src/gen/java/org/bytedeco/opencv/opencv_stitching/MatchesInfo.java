// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_stitching;

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
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;
import org.bytedeco.opencv.opencv_shape.*;
import static org.bytedeco.opencv.global.opencv_shape.*;
import org.bytedeco.opencv.opencv_xfeatures2d.*;
import static org.bytedeco.opencv.global.opencv_xfeatures2d.*;

import static org.bytedeco.opencv.global.opencv_stitching.*;


/** \brief Structure containing information about matches between two images.
<p>
It's assumed that there is a transformation between those images. Transformation may be
homography or affine transformation based on selected matcher.
<p>
@see detail::FeaturesMatcher
*/
@Namespace("cv::detail") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_stitching.class)
public class MatchesInfo extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MatchesInfo(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MatchesInfo(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public MatchesInfo position(long position) {
        return (MatchesInfo)super.position(position);
    }

    public MatchesInfo() { super((Pointer)null); allocate(); }
    private native void allocate();
    public MatchesInfo(@Const @ByRef MatchesInfo other) { super((Pointer)null); allocate(other); }
    private native void allocate(@Const @ByRef MatchesInfo other);
    public native @ByRef @Name("operator =") MatchesInfo put(@Const @ByRef MatchesInfo other);

    public native int src_img_idx(); public native MatchesInfo src_img_idx(int src_img_idx);
    /** Images indices (optional) */
    public native int dst_img_idx(); public native MatchesInfo dst_img_idx(int dst_img_idx);
    public native @ByRef DMatchVector matches(); public native MatchesInfo matches(DMatchVector matches);
    /** Geometrically consistent matches mask */
    public native @Cast("uchar*") @StdVector BytePointer inliers_mask(); public native MatchesInfo inliers_mask(BytePointer inliers_mask);
    /** Number of geometrically consistent matches */
    public native int num_inliers(); public native MatchesInfo num_inliers(int num_inliers);
    /** Estimated transformation */
    public native @ByRef Mat H(); public native MatchesInfo H(Mat H);
    /** Confidence two images are from the same panorama */
    public native double confidence(); public native MatchesInfo confidence(double confidence);
    public native @ByVal DMatchVector getMatches();
    public native @Cast("uchar*") @StdVector BytePointer getInliers();
}
