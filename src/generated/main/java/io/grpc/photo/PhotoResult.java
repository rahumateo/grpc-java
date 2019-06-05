// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: photo/photofeed.proto

package io.grpc.photo;

/**
 * Protobuf type {@code photo.PhotoResult}
 */
public  final class PhotoResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:photo.PhotoResult)
    PhotoResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PhotoResult.newBuilder() to construct.
  private PhotoResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PhotoResult() {
    title_ = "";
    photos_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PhotoResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PhotoResult(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            title_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              photos_ = new java.util.ArrayList<io.grpc.photo.Photo>();
              mutable_bitField0_ |= 0x00000001;
            }
            photos_.add(
                input.readMessage(io.grpc.photo.Photo.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        photos_ = java.util.Collections.unmodifiableList(photos_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.photo.FlickrPhotoProto.internal_static_photo_PhotoResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.photo.FlickrPhotoProto.internal_static_photo_PhotoResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.photo.PhotoResult.class, io.grpc.photo.PhotoResult.Builder.class);
  }

  public static final int TITLE_FIELD_NUMBER = 1;
  private volatile java.lang.Object title_;
  /**
   * <code>string title = 1;</code>
   */
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   * <code>string title = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PHOTOS_FIELD_NUMBER = 2;
  private java.util.List<io.grpc.photo.Photo> photos_;
  /**
   * <code>repeated .photo.Photo photos = 2;</code>
   */
  public java.util.List<io.grpc.photo.Photo> getPhotosList() {
    return photos_;
  }
  /**
   * <code>repeated .photo.Photo photos = 2;</code>
   */
  public java.util.List<? extends io.grpc.photo.PhotoOrBuilder> 
      getPhotosOrBuilderList() {
    return photos_;
  }
  /**
   * <code>repeated .photo.Photo photos = 2;</code>
   */
  public int getPhotosCount() {
    return photos_.size();
  }
  /**
   * <code>repeated .photo.Photo photos = 2;</code>
   */
  public io.grpc.photo.Photo getPhotos(int index) {
    return photos_.get(index);
  }
  /**
   * <code>repeated .photo.Photo photos = 2;</code>
   */
  public io.grpc.photo.PhotoOrBuilder getPhotosOrBuilder(
      int index) {
    return photos_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getTitleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, title_);
    }
    for (int i = 0; i < photos_.size(); i++) {
      output.writeMessage(2, photos_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTitleBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, title_);
    }
    for (int i = 0; i < photos_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, photos_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.grpc.photo.PhotoResult)) {
      return super.equals(obj);
    }
    io.grpc.photo.PhotoResult other = (io.grpc.photo.PhotoResult) obj;

    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (!getPhotosList()
        .equals(other.getPhotosList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    if (getPhotosCount() > 0) {
      hash = (37 * hash) + PHOTOS_FIELD_NUMBER;
      hash = (53 * hash) + getPhotosList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.photo.PhotoResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.photo.PhotoResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.photo.PhotoResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.photo.PhotoResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.photo.PhotoResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.photo.PhotoResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.photo.PhotoResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.photo.PhotoResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.photo.PhotoResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.photo.PhotoResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.photo.PhotoResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.photo.PhotoResult parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grpc.photo.PhotoResult prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code photo.PhotoResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:photo.PhotoResult)
      io.grpc.photo.PhotoResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.photo.FlickrPhotoProto.internal_static_photo_PhotoResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.photo.FlickrPhotoProto.internal_static_photo_PhotoResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.photo.PhotoResult.class, io.grpc.photo.PhotoResult.Builder.class);
    }

    // Construct using io.grpc.photo.PhotoResult.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getPhotosFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      title_ = "";

      if (photosBuilder_ == null) {
        photos_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        photosBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.photo.FlickrPhotoProto.internal_static_photo_PhotoResult_descriptor;
    }

    @java.lang.Override
    public io.grpc.photo.PhotoResult getDefaultInstanceForType() {
      return io.grpc.photo.PhotoResult.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.photo.PhotoResult build() {
      io.grpc.photo.PhotoResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.photo.PhotoResult buildPartial() {
      io.grpc.photo.PhotoResult result = new io.grpc.photo.PhotoResult(this);
      int from_bitField0_ = bitField0_;
      result.title_ = title_;
      if (photosBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          photos_ = java.util.Collections.unmodifiableList(photos_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.photos_ = photos_;
      } else {
        result.photos_ = photosBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.photo.PhotoResult) {
        return mergeFrom((io.grpc.photo.PhotoResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.photo.PhotoResult other) {
      if (other == io.grpc.photo.PhotoResult.getDefaultInstance()) return this;
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        onChanged();
      }
      if (photosBuilder_ == null) {
        if (!other.photos_.isEmpty()) {
          if (photos_.isEmpty()) {
            photos_ = other.photos_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePhotosIsMutable();
            photos_.addAll(other.photos_);
          }
          onChanged();
        }
      } else {
        if (!other.photos_.isEmpty()) {
          if (photosBuilder_.isEmpty()) {
            photosBuilder_.dispose();
            photosBuilder_ = null;
            photos_ = other.photos_;
            bitField0_ = (bitField0_ & ~0x00000001);
            photosBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPhotosFieldBuilder() : null;
          } else {
            photosBuilder_.addAllMessages(other.photos_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grpc.photo.PhotoResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.photo.PhotoResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object title_ = "";
    /**
     * <code>string title = 1;</code>
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string title = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string title = 1;</code>
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      title_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string title = 1;</code>
     */
    public Builder clearTitle() {
      
      title_ = getDefaultInstance().getTitle();
      onChanged();
      return this;
    }
    /**
     * <code>string title = 1;</code>
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      title_ = value;
      onChanged();
      return this;
    }

    private java.util.List<io.grpc.photo.Photo> photos_ =
      java.util.Collections.emptyList();
    private void ensurePhotosIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        photos_ = new java.util.ArrayList<io.grpc.photo.Photo>(photos_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grpc.photo.Photo, io.grpc.photo.Photo.Builder, io.grpc.photo.PhotoOrBuilder> photosBuilder_;

    /**
     * <code>repeated .photo.Photo photos = 2;</code>
     */
    public java.util.List<io.grpc.photo.Photo> getPhotosList() {
      if (photosBuilder_ == null) {
        return java.util.Collections.unmodifiableList(photos_);
      } else {
        return photosBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .photo.Photo photos = 2;</code>
     */
    public int getPhotosCount() {
      if (photosBuilder_ == null) {
        return photos_.size();
      } else {
        return photosBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .photo.Photo photos = 2;</code>
     */
    public io.grpc.photo.Photo getPhotos(int index) {
      if (photosBuilder_ == null) {
        return photos_.get(index);
      } else {
        return photosBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .photo.Photo photos = 2;</code>
     */
    public Builder setPhotos(
        int index, io.grpc.photo.Photo value) {
      if (photosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePhotosIsMutable();
        photos_.set(index, value);
        onChanged();
      } else {
        photosBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .photo.Photo photos = 2;</code>
     */
    public Builder setPhotos(
        int index, io.grpc.photo.Photo.Builder builderForValue) {
      if (photosBuilder_ == null) {
        ensurePhotosIsMutable();
        photos_.set(index, builderForValue.build());
        onChanged();
      } else {
        photosBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .photo.Photo photos = 2;</code>
     */
    public Builder addPhotos(io.grpc.photo.Photo value) {
      if (photosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePhotosIsMutable();
        photos_.add(value);
        onChanged();
      } else {
        photosBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .photo.Photo photos = 2;</code>
     */
    public Builder addPhotos(
        int index, io.grpc.photo.Photo value) {
      if (photosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePhotosIsMutable();
        photos_.add(index, value);
        onChanged();
      } else {
        photosBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .photo.Photo photos = 2;</code>
     */
    public Builder addPhotos(
        io.grpc.photo.Photo.Builder builderForValue) {
      if (photosBuilder_ == null) {
        ensurePhotosIsMutable();
        photos_.add(builderForValue.build());
        onChanged();
      } else {
        photosBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .photo.Photo photos = 2;</code>
     */
    public Builder addPhotos(
        int index, io.grpc.photo.Photo.Builder builderForValue) {
      if (photosBuilder_ == null) {
        ensurePhotosIsMutable();
        photos_.add(index, builderForValue.build());
        onChanged();
      } else {
        photosBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .photo.Photo photos = 2;</code>
     */
    public Builder addAllPhotos(
        java.lang.Iterable<? extends io.grpc.photo.Photo> values) {
      if (photosBuilder_ == null) {
        ensurePhotosIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, photos_);
        onChanged();
      } else {
        photosBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .photo.Photo photos = 2;</code>
     */
    public Builder clearPhotos() {
      if (photosBuilder_ == null) {
        photos_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        photosBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .photo.Photo photos = 2;</code>
     */
    public Builder removePhotos(int index) {
      if (photosBuilder_ == null) {
        ensurePhotosIsMutable();
        photos_.remove(index);
        onChanged();
      } else {
        photosBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .photo.Photo photos = 2;</code>
     */
    public io.grpc.photo.Photo.Builder getPhotosBuilder(
        int index) {
      return getPhotosFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .photo.Photo photos = 2;</code>
     */
    public io.grpc.photo.PhotoOrBuilder getPhotosOrBuilder(
        int index) {
      if (photosBuilder_ == null) {
        return photos_.get(index);  } else {
        return photosBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .photo.Photo photos = 2;</code>
     */
    public java.util.List<? extends io.grpc.photo.PhotoOrBuilder> 
         getPhotosOrBuilderList() {
      if (photosBuilder_ != null) {
        return photosBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(photos_);
      }
    }
    /**
     * <code>repeated .photo.Photo photos = 2;</code>
     */
    public io.grpc.photo.Photo.Builder addPhotosBuilder() {
      return getPhotosFieldBuilder().addBuilder(
          io.grpc.photo.Photo.getDefaultInstance());
    }
    /**
     * <code>repeated .photo.Photo photos = 2;</code>
     */
    public io.grpc.photo.Photo.Builder addPhotosBuilder(
        int index) {
      return getPhotosFieldBuilder().addBuilder(
          index, io.grpc.photo.Photo.getDefaultInstance());
    }
    /**
     * <code>repeated .photo.Photo photos = 2;</code>
     */
    public java.util.List<io.grpc.photo.Photo.Builder> 
         getPhotosBuilderList() {
      return getPhotosFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grpc.photo.Photo, io.grpc.photo.Photo.Builder, io.grpc.photo.PhotoOrBuilder> 
        getPhotosFieldBuilder() {
      if (photosBuilder_ == null) {
        photosBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grpc.photo.Photo, io.grpc.photo.Photo.Builder, io.grpc.photo.PhotoOrBuilder>(
                photos_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        photos_ = null;
      }
      return photosBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:photo.PhotoResult)
  }

  // @@protoc_insertion_point(class_scope:photo.PhotoResult)
  private static final io.grpc.photo.PhotoResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.photo.PhotoResult();
  }

  public static io.grpc.photo.PhotoResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PhotoResult>
      PARSER = new com.google.protobuf.AbstractParser<PhotoResult>() {
    @java.lang.Override
    public PhotoResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PhotoResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PhotoResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PhotoResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.photo.PhotoResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
