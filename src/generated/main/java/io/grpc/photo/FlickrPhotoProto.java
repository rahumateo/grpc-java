// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: photo/photofeed.proto

package io.grpc.photo;

public final class FlickrPhotoProto {
  private FlickrPhotoProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_photo_PhotoSearchRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_photo_PhotoSearchRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_photo_PhotoResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_photo_PhotoResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_photo_Photo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_photo_Photo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025photo/photofeed.proto\022\005photo\"\"\n\022PhotoS" +
      "earchRequest\022\014\n\004tags\030\001 \001(\t\":\n\013PhotoResul" +
      "t\022\r\n\005title\030\001 \001(\t\022\034\n\006photos\030\002 \003(\0132\014.photo" +
      ".Photo\"H\n\005Photo\022\r\n\005title\030\001 \001(\t\022\023\n\013descri" +
      "ption\030\002 \001(\t\022\016\n\006author\030\003 \001(\t\022\013\n\003url\030\004 \001(\t" +
      "2R\n\014PhotoService\022B\n\017GetPublicPhotos\022\031.ph" +
      "oto.PhotoSearchRequest\032\022.photo.PhotoResu" +
      "lt\"\000B#\n\rio.grpc.photoB\020FlickrPhotoProtoP" +
      "\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_photo_PhotoSearchRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_photo_PhotoSearchRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_photo_PhotoSearchRequest_descriptor,
        new java.lang.String[] { "Tags", });
    internal_static_photo_PhotoResult_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_photo_PhotoResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_photo_PhotoResult_descriptor,
        new java.lang.String[] { "Title", "Photos", });
    internal_static_photo_Photo_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_photo_Photo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_photo_Photo_descriptor,
        new java.lang.String[] { "Title", "Description", "Author", "Url", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
