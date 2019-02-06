// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.opencv.global.opencv_core.*;
 // namespace

//////////////////////////////// Size_ ////////////////////////////////

/** \brief Template class for specifying the size of an image or rectangle.
<p>
The class includes two members called width and height. The structure can be converted to and from
the old OpenCV structures CvSize and CvSize2D32f . The same set of arithmetic and comparison
operations as for Point_ is available.
<p>
OpenCV defines the following Size_\<\> aliases:
<pre>{@code
    typedef Size_<int> Size2i;
    typedef Size2i Size;
    typedef Size_<float> Size2f;
}</pre>
*/
@Name("cv::Size_<int>") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Size extends IntPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Size(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Size(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Size position(long position) {
        return (Size)super.position(position);
    }


    /** default constructor */
    public Size() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Size(int _width, int _height) { super((Pointer)null); allocate(_width, _height); }
    private native void allocate(int _width, int _height);
    public Size(@Const @ByRef Size sz) { super((Pointer)null); allocate(sz); }
    private native void allocate(@Const @ByRef Size sz);
    public Size(@Const @ByRef Point pt) { super((Pointer)null); allocate(pt); }
    private native void allocate(@Const @ByRef Point pt);

    public native @ByRef @Name("operator =") Size put(@Const @ByRef Size sz);
    /** the area (width*height) */
    public native int area();
    /** aspect ratio (width/height) */
    public native double aspectRatio();
    /** true if empty */
    public native @Cast("bool") boolean empty();

    /** conversion of another data type. */

    /** the width */
    public native int width(); public native Size width(int width);
    /** the height */
    public native int height(); public native Size height(int height);
}
