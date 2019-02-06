// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_aruco;

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

import static org.bytedeco.opencv.global.opencv_aruco.*;


/** \addtogroup aruco
 *  \{
<p>
<p>
/**
 * \brief ChArUco board
 * Specific class for ChArUco boards. A ChArUco board is a planar board where the markers are placed
 * inside the white squares of a chessboard. The benefits of ChArUco boards is that they provide
 * both, ArUco markers versatility and chessboard corner precision, which is important for
 * calibration and pose estimation.
 * This class also allows the easy creation and drawing of ChArUco boards.
 */
@Namespace("cv::aruco") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_aruco.class)
public class CharucoBoard extends Board {
    static { Loader.load(); }
    /** Default native constructor. */
    public CharucoBoard() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CharucoBoard(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CharucoBoard(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CharucoBoard position(long position) {
        return (CharucoBoard)super.position(position);
    }

    // vector of chessboard 3D corners precalculated
    public native @ByRef @Cast("std::vector<cv::Point3f>*") Point3fVector chessboardCorners(); public native CharucoBoard chessboardCorners(Point3fVector chessboardCorners);

    // for each charuco corner, nearest marker id and nearest marker corner id of each marker
    public native @ByRef IntVectorVector nearestMarkerIdx(); public native CharucoBoard nearestMarkerIdx(IntVectorVector nearestMarkerIdx);
    public native @ByRef IntVectorVector nearestMarkerCorners(); public native CharucoBoard nearestMarkerCorners(IntVectorVector nearestMarkerCorners);

    /**
     * \brief Draw a ChArUco board
     *
     * @param outSize size of the output image in pixels.
     * @param img output image with the board. The size of this image will be outSize
     * and the board will be on the center, keeping the board proportions.
     * @param marginSize minimum margins (in pixels) of the board in the output image
     * @param borderBits width of the marker borders.
     *
     * This function return the image of the ChArUco board, ready to be printed.
     */
    public native void draw(@ByVal Size outSize, @ByVal Mat img, int marginSize/*=0*/, int borderBits/*=1*/);
    public native void draw(@ByVal Size outSize, @ByVal Mat img);
    public native void draw(@ByVal Size outSize, @ByVal UMat img, int marginSize/*=0*/, int borderBits/*=1*/);
    public native void draw(@ByVal Size outSize, @ByVal UMat img);
    public native void draw(@ByVal Size outSize, @ByVal GpuMat img, int marginSize/*=0*/, int borderBits/*=1*/);
    public native void draw(@ByVal Size outSize, @ByVal GpuMat img);


    /**
     * \brief Create a CharucoBoard object
     *
     * @param squaresX number of chessboard squares in X direction
     * @param squaresY number of chessboard squares in Y direction
     * @param squareLength chessboard square side length (normally in meters)
     * @param markerLength marker side length (same unit than squareLength)
     * @param dictionary dictionary of markers indicating the type of markers.
     * The first markers in the dictionary are used to fill the white chessboard squares.
     * @return the output CharucoBoard object
     *
     * This functions creates a CharucoBoard object given the number of squares in each direction
     * and the size of the markers and chessboard squares.
     */
    public static native @Ptr CharucoBoard create(int squaresX, int squaresY, float squareLength,
                                                float markerLength, @Ptr Dictionary dictionary);

    /**
      *
      */
    public native @ByVal Size getChessboardSize();

    /**
      *
      */
    public native float getSquareLength();

    /**
      *
      */
    public native float getMarkerLength();
}
