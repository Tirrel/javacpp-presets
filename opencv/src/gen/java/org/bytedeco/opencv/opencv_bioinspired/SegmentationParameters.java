// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_bioinspired;

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

import static org.bytedeco.opencv.global.opencv_bioinspired.*;

/** \addtogroup bioinspired
 *  \{
<p>
/** \brief parameter structure that stores the transient events detector setup parameters
*/
@Namespace("cv::bioinspired") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_bioinspired.class)
public class SegmentationParameters extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SegmentationParameters(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SegmentationParameters(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SegmentationParameters position(long position) {
        return (SegmentationParameters)super.position(position);
    }
 // CV_EXPORTS_W_MAP to export to python native dictionnaries
	// default structure instance construction with default values
	public SegmentationParameters() { super((Pointer)null); allocate(); }
	private native void allocate();
	// all properties list
	public native float thresholdON(); public native SegmentationParameters thresholdON(float thresholdON);
	public native float thresholdOFF(); public native SegmentationParameters thresholdOFF(float thresholdOFF);
	/** the time constant of the first order low pass filter, use it to cut high temporal frequencies (noise or fast motion), unit is frames, typical value is 0.5 frame */
	public native float localEnergy_temporalConstant(); public native SegmentationParameters localEnergy_temporalConstant(float localEnergy_temporalConstant);
	/** the spatial constant of the first order low pass filter, use it to cut high spatial frequencies (noise or thick contours), unit is pixels, typical value is 5 pixel */
	public native float localEnergy_spatialConstant(); public native SegmentationParameters localEnergy_spatialConstant(float localEnergy_spatialConstant);
	/** local neighborhood energy filtering parameters : the aim is to get information about the energy neighborhood to perform a center surround energy analysis */
	public native float neighborhoodEnergy_temporalConstant(); public native SegmentationParameters neighborhoodEnergy_temporalConstant(float neighborhoodEnergy_temporalConstant);
	public native float neighborhoodEnergy_spatialConstant(); public native SegmentationParameters neighborhoodEnergy_spatialConstant(float neighborhoodEnergy_spatialConstant);
	/** context neighborhood energy filtering parameters : the aim is to get information about the energy on a wide neighborhood area to filtered out local effects */
	public native float contextEnergy_temporalConstant(); public native SegmentationParameters contextEnergy_temporalConstant(float contextEnergy_temporalConstant);
	public native float contextEnergy_spatialConstant(); public native SegmentationParameters contextEnergy_spatialConstant(float contextEnergy_spatialConstant);
}
