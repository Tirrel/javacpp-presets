// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.onnx.global.onnx.*;



// Describes a whole .proto file.  To get the FileDescriptor for a compiled-in
// file, get the descriptor for something defined in that file and call
// descriptor->file().  Use DescriptorPool to construct your own descriptors.
@Namespace("google::protobuf") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class FileDescriptor extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FileDescriptor(Pointer p) { super(p); }


  // The filename, relative to the source tree.
  // e.g. "foo/bar/baz.proto"
  public native @StdString BytePointer name();

  // The package, e.g. "google.protobuf.compiler".
  public native @StdString @Name("package") BytePointer _package();

  // The DescriptorPool in which this FileDescriptor and all its contents were
  // allocated.  Never NULL.
  public native @Const DescriptorPool pool();

  // The number of files imported by this one.
  public native int dependency_count();
  // Gets an imported file by index, where 0 <= index < dependency_count().
  // These are returned in the order they were defined in the .proto file.
  public native @Const FileDescriptor dependency(int index);

  // The number of files public imported by this one.
  // The public dependency list is a subset of the dependency list.
  public native int public_dependency_count();
  // Gets a public imported file by index, where 0 <= index <
  // public_dependency_count().
  // These are returned in the order they were defined in the .proto file.
  public native @Const FileDescriptor public_dependency(int index);

  // The number of files that are imported for weak fields.
  // The weak dependency list is a subset of the dependency list.
  public native int weak_dependency_count();
  // Gets a weak imported file by index, where 0 <= index <
  // weak_dependency_count().
  // These are returned in the order they were defined in the .proto file.
  public native @Const FileDescriptor weak_dependency(int index);

  // Number of top-level message types defined in this file.  (This does not
  // include nested types.)
  public native int message_type_count();
  // Gets a top-level message type, where 0 <= index < message_type_count().
  // These are returned in the order they were defined in the .proto file.
  public native @Cast("const google::protobuf::Descriptor*") Pointer message_type(int index);

  // Number of top-level enum types defined in this file.  (This does not
  // include nested types.)
  public native int enum_type_count();
  // Gets a top-level enum type, where 0 <= index < enum_type_count().
  // These are returned in the order they were defined in the .proto file.
  public native @Const EnumDescriptor enum_type(int index);

  // Number of services defined in this file.
  public native int service_count();
  // Gets a service, where 0 <= index < service_count().
  // These are returned in the order they were defined in the .proto file.
  public native @Const ServiceDescriptor service(int index);

  // Number of extensions defined at file scope.  (This does not include
  // extensions nested within message types.)
  public native int extension_count();
  // Gets an extension's descriptor, where 0 <= index < extension_count().
  // These are returned in the order they were defined in the .proto file.
  public native @Const FieldDescriptor extension(int index);

  // Get options for this file.  These are specified in the .proto file by
  // placing lines like "option foo = 1234;" at the top level, outside of any
  // other definitions.  Allowed options are defined by FileOptions in
  // descriptor.proto, and any available extensions of that message.
  public native @Const @ByRef FileOptions options();

  // Syntax of this file.
  /** enum google::protobuf::FileDescriptor::Syntax */
  public static final int
    SYNTAX_UNKNOWN = 0,
    SYNTAX_PROTO2  = 2,
    SYNTAX_PROTO3  = 3;
  public native @Cast("google::protobuf::FileDescriptor::Syntax") int syntax();
  public static native @Cast("const char*") BytePointer SyntaxName(@Cast("google::protobuf::FileDescriptor::Syntax") int syntax);

  // Find a top-level message type by name.  Returns NULL if not found.
  public native @Cast("const google::protobuf::Descriptor*") Pointer FindMessageTypeByName(@StdString BytePointer name);
  public native @Cast("const google::protobuf::Descriptor*") Pointer FindMessageTypeByName(@StdString String name);
  // Find a top-level enum type by name.  Returns NULL if not found.
  public native @Const EnumDescriptor FindEnumTypeByName(@StdString BytePointer name);
  public native @Const EnumDescriptor FindEnumTypeByName(@StdString String name);
  // Find an enum value defined in any top-level enum by name.  Returns NULL if
  // not found.
  public native @Const EnumValueDescriptor FindEnumValueByName(@StdString BytePointer name);
  public native @Const EnumValueDescriptor FindEnumValueByName(@StdString String name);
  // Find a service definition by name.  Returns NULL if not found.
  public native @Const ServiceDescriptor FindServiceByName(@StdString BytePointer name);
  public native @Const ServiceDescriptor FindServiceByName(@StdString String name);
  // Find a top-level extension definition by name.  Returns NULL if not found.
  public native @Const FieldDescriptor FindExtensionByName(@StdString BytePointer name);
  public native @Const FieldDescriptor FindExtensionByName(@StdString String name);
  // Similar to FindExtensionByName(), but searches by lowercased-name.  See
  // Descriptor::FindFieldByLowercaseName().
  public native @Const FieldDescriptor FindExtensionByLowercaseName(@StdString BytePointer name);
  public native @Const FieldDescriptor FindExtensionByLowercaseName(@StdString String name);
  // Similar to FindExtensionByName(), but searches by camelcased-name.  See
  // Descriptor::FindFieldByCamelcaseName().
  public native @Const FieldDescriptor FindExtensionByCamelcaseName(@StdString BytePointer name);
  public native @Const FieldDescriptor FindExtensionByCamelcaseName(@StdString String name);

  // See Descriptor::CopyTo().
  // Notes:
  // - This method does NOT copy source code information since it is relatively
  //   large and rarely needed.  See CopySourceCodeInfoTo() below.
  public native void CopyTo(FileDescriptorProto proto);
  // Write the source code information of this FileDescriptor into the given
  // FileDescriptorProto.  See CopyTo() above.
  public native void CopySourceCodeInfoTo(FileDescriptorProto proto);
  // Fill the json_name field of FieldDescriptorProto for all fields. Can only
  // be called after CopyTo().
  public native void CopyJsonNameTo(FileDescriptorProto proto);

  // See Descriptor::DebugString().
  public native @StdString BytePointer DebugString();

  // See Descriptor::DebugStringWithOptions().
  public native @StdString BytePointer DebugStringWithOptions(@Const @ByRef DebugStringOptions options);

  // Returns true if this is a placeholder for an unknown file. This will
  // only be the case if this descriptor comes from a DescriptorPool
  // with AllowUnknownDependencies() set.
  public native @Cast("bool") boolean is_placeholder();

  // Updates |*out_location| to the source location of the complete extent of
  // this file declaration (namely, the empty path).
  public native @Cast("bool") boolean GetSourceLocation(SourceLocation out_location);

  // Updates |*out_location| to the source location of the complete
  // extent of the declaration or declaration-part denoted by |path|.
  // Returns false and leaves |*out_location| unchanged iff location
  // information was not available.  (See SourceCodeInfo for
  // description of path encoding.)
  public native @Cast("bool") boolean GetSourceLocation(@StdVector IntPointer path,
                           SourceLocation out_location);
  public native @Cast("bool") boolean GetSourceLocation(@StdVector IntBuffer path,
                           SourceLocation out_location);
  public native @Cast("bool") boolean GetSourceLocation(@StdVector int[] path,
                           SourceLocation out_location);
}