// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld/helloworld.proto

package io.grpc.helloworld;

public final class HelloWorldProto {
  private HelloWorldProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_helloworld_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_helloworld_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_helloworld_HelloReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_helloworld_HelloReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033helloworld/helloworld.proto\022\nhelloworl" +
      "d\"\034\n\014HelloRequest\022\014\n\004name\030\001 \001(\t\"\035\n\nHello" +
      "Reply\022\017\n\007message\030\001 \001(\t2L\n\007Greeter\022A\n\013Say" +
      "Greeting\022\030.helloworld.HelloRequest\032\026.hel" +
      "loworld.HelloReply\"\000B\'\n\022io.grpc.hellowor" +
      "ldB\017HelloWorldProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_helloworld_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_helloworld_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_helloworld_HelloRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_helloworld_HelloReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_helloworld_HelloReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_helloworld_HelloReply_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
