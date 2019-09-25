// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorInfo_CooSparse extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorInfo_CooSparse(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TensorInfo_CooSparse(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TensorInfo_CooSparse position(long position) {
        return (TensorInfo_CooSparse)super.position(position);
    }

  public TensorInfo_CooSparse() { super((Pointer)null); allocate(); }
  private native void allocate();

  public TensorInfo_CooSparse(@Const @ByRef TensorInfo_CooSparse from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef TensorInfo_CooSparse from);

  public native @ByRef @Name("operator =") TensorInfo_CooSparse put(@Const @ByRef TensorInfo_CooSparse from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef TensorInfo_CooSparse default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const TensorInfo_CooSparse internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(TensorInfo_CooSparse other);
  public native void Swap(TensorInfo_CooSparse other);
  

  // implements Message ----------------------------------------------

  public native TensorInfo_CooSparse New();

  public native TensorInfo_CooSparse New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef TensorInfo_CooSparse from);
  public native void MergeFrom(@Const @ByRef TensorInfo_CooSparse from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // string values_tensor_name = 1;
  public native void clear_values_tensor_name();
  @MemberGetter public static native int kValuesTensorNameFieldNumber();
  public static final int kValuesTensorNameFieldNumber = kValuesTensorNameFieldNumber();
  public native @StdString BytePointer values_tensor_name();
  public native void set_values_tensor_name(@StdString BytePointer value);
  public native void set_values_tensor_name(@StdString String value);
  public native void set_values_tensor_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_values_tensor_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_values_tensor_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_values_tensor_name();
  public native void set_allocated_values_tensor_name(@StdString @Cast({"char*", "std::string*"}) BytePointer values_tensor_name);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_values_tensor_name();
  public native void unsafe_arena_set_allocated_values_tensor_name(
        @StdString @Cast({"char*", "std::string*"}) BytePointer values_tensor_name);

  // string indices_tensor_name = 2;
  public native void clear_indices_tensor_name();
  @MemberGetter public static native int kIndicesTensorNameFieldNumber();
  public static final int kIndicesTensorNameFieldNumber = kIndicesTensorNameFieldNumber();
  public native @StdString BytePointer indices_tensor_name();
  public native void set_indices_tensor_name(@StdString BytePointer value);
  public native void set_indices_tensor_name(@StdString String value);
  public native void set_indices_tensor_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_indices_tensor_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_indices_tensor_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_indices_tensor_name();
  public native void set_allocated_indices_tensor_name(@StdString @Cast({"char*", "std::string*"}) BytePointer indices_tensor_name);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_indices_tensor_name();
  public native void unsafe_arena_set_allocated_indices_tensor_name(
        @StdString @Cast({"char*", "std::string*"}) BytePointer indices_tensor_name);

  // string dense_shape_tensor_name = 3;
  public native void clear_dense_shape_tensor_name();
  @MemberGetter public static native int kDenseShapeTensorNameFieldNumber();
  public static final int kDenseShapeTensorNameFieldNumber = kDenseShapeTensorNameFieldNumber();
  public native @StdString BytePointer dense_shape_tensor_name();
  public native void set_dense_shape_tensor_name(@StdString BytePointer value);
  public native void set_dense_shape_tensor_name(@StdString String value);
  public native void set_dense_shape_tensor_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_dense_shape_tensor_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_dense_shape_tensor_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_dense_shape_tensor_name();
  public native void set_allocated_dense_shape_tensor_name(@StdString @Cast({"char*", "std::string*"}) BytePointer dense_shape_tensor_name);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_dense_shape_tensor_name();
  public native void unsafe_arena_set_allocated_dense_shape_tensor_name(
        @StdString @Cast({"char*", "std::string*"}) BytePointer dense_shape_tensor_name);
}