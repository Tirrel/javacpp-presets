// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.opencv.global.opencv_core.*;

@Name("cv::Rect_<double>") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Rect2d extends DoublePointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Rect2d(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Rect2d(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Rect2d position(long position) {
        return (Rect2d)super.position(position);
    }


    /** default constructor */
    public Rect2d() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Rect2d(double _x, double _y, double _width, double _height) { super((Pointer)null); allocate(_x, _y, _width, _height); }
    private native void allocate(double _x, double _y, double _width, double _height);
    public Rect2d(@Const @ByRef Rect2d r) { super((Pointer)null); allocate(r); }
    private native void allocate(@Const @ByRef Rect2d r);
    public Rect2d(@Const @ByRef Point2d org, @Const @ByRef Size2d sz) { super((Pointer)null); allocate(org, sz); }
    private native void allocate(@Const @ByRef Point2d org, @Const @ByRef Size2d sz);
    public Rect2d(@Const @ByRef Point2d pt1, @Const @ByRef Point2d pt2) { super((Pointer)null); allocate(pt1, pt2); }
    private native void allocate(@Const @ByRef Point2d pt1, @Const @ByRef Point2d pt2);

    public native @ByRef @Name("operator =") Rect2d put( @Const @ByRef Rect2d r );
    /** the top-left corner */
    public native @ByVal Point2d tl();
    /** the bottom-right corner */
    public native @ByVal Point2d br();

    /** size (width, height) of the rectangle */
    public native @ByVal Size2d size();
    /** area (width*height) of the rectangle */
    public native double area();
    /** true if empty */
    public native @Cast("bool") boolean empty();

    /** conversion to another data type */

    /** checks whether the rectangle contains the point */
    public native @Cast("bool") boolean contains(@Const @ByRef Point2d pt);

    /** x coordinate of the top-left corner */
    public native double x(); public native Rect2d x(double x);
    /** y coordinate of the top-left corner */
    public native double y(); public native Rect2d y(double y);
    /** width of the rectangle */
    public native double width(); public native Rect2d width(double width);
    /** height of the rectangle */
    public native double height(); public native Rect2d height(double height);
}
