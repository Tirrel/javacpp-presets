// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_text;

import org.bytedeco.javacpp.annotation.Index;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;

import static org.bytedeco.opencv.global.opencv_text.*;

@Name("std::vector<std::vector<cv::text::ERStat> >") @Properties(inherit = org.bytedeco.opencv.presets.opencv_text.class)
public class ERStatVectorVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ERStatVectorVector(Pointer p) { super(p); }
    public ERStatVectorVector(ERStatVector value) { this(1); put(0, value); }
    public ERStatVectorVector(ERStatVector ... array) { this(array.length); put(array); }
    public ERStatVectorVector()       { allocate();  }
    public ERStatVectorVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef ERStatVectorVector put(@ByRef ERStatVectorVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @ByRef ERStatVector get(@Cast("size_t") long i);
    public native ERStatVectorVector put(@Cast("size_t") long i, ERStatVector value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @ByRef ERStatVector value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator++") @ByRef Iterator increment();
        public native @Name("operator==") boolean equals(@ByRef Iterator it);
        public native @Name("operator*") @ByRef @Const ERStatVector get();
    }

    public ERStatVector[] get() {
        ERStatVector[] array = new ERStatVector[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public ERStatVector pop_back() {
        long size = size();
        ERStatVector value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public ERStatVectorVector push_back(ERStatVector value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public ERStatVectorVector put(ERStatVector value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public ERStatVectorVector put(ERStatVector ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

