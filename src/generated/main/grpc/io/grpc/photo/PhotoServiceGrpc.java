package io.grpc.photo;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: photo/photofeed.proto")
public final class PhotoServiceGrpc {

  private PhotoServiceGrpc() {}

  public static final String SERVICE_NAME = "photo.PhotoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.photo.PhotoSearchRequest,
      io.grpc.photo.PhotoResult> getGetPublicPhotosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPublicPhotos",
      requestType = io.grpc.photo.PhotoSearchRequest.class,
      responseType = io.grpc.photo.PhotoResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.photo.PhotoSearchRequest,
      io.grpc.photo.PhotoResult> getGetPublicPhotosMethod() {
    io.grpc.MethodDescriptor<io.grpc.photo.PhotoSearchRequest, io.grpc.photo.PhotoResult> getGetPublicPhotosMethod;
    if ((getGetPublicPhotosMethod = PhotoServiceGrpc.getGetPublicPhotosMethod) == null) {
      synchronized (PhotoServiceGrpc.class) {
        if ((getGetPublicPhotosMethod = PhotoServiceGrpc.getGetPublicPhotosMethod) == null) {
          PhotoServiceGrpc.getGetPublicPhotosMethod = getGetPublicPhotosMethod = 
              io.grpc.MethodDescriptor.<io.grpc.photo.PhotoSearchRequest, io.grpc.photo.PhotoResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "photo.PhotoService", "GetPublicPhotos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.photo.PhotoSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.photo.PhotoResult.getDefaultInstance()))
                  .setSchemaDescriptor(new PhotoServiceMethodDescriptorSupplier("GetPublicPhotos"))
                  .build();
          }
        }
     }
     return getGetPublicPhotosMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PhotoServiceStub newStub(io.grpc.Channel channel) {
    return new PhotoServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PhotoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PhotoServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PhotoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PhotoServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PhotoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getPublicPhotos(io.grpc.photo.PhotoSearchRequest request,
        io.grpc.stub.StreamObserver<io.grpc.photo.PhotoResult> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPublicPhotosMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPublicPhotosMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.photo.PhotoSearchRequest,
                io.grpc.photo.PhotoResult>(
                  this, METHODID_GET_PUBLIC_PHOTOS)))
          .build();
    }
  }

  /**
   */
  public static final class PhotoServiceStub extends io.grpc.stub.AbstractStub<PhotoServiceStub> {
    private PhotoServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PhotoServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PhotoServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PhotoServiceStub(channel, callOptions);
    }

    /**
     */
    public void getPublicPhotos(io.grpc.photo.PhotoSearchRequest request,
        io.grpc.stub.StreamObserver<io.grpc.photo.PhotoResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPublicPhotosMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PhotoServiceBlockingStub extends io.grpc.stub.AbstractStub<PhotoServiceBlockingStub> {
    private PhotoServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PhotoServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PhotoServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PhotoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.photo.PhotoResult getPublicPhotos(io.grpc.photo.PhotoSearchRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPublicPhotosMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PhotoServiceFutureStub extends io.grpc.stub.AbstractStub<PhotoServiceFutureStub> {
    private PhotoServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PhotoServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PhotoServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PhotoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.photo.PhotoResult> getPublicPhotos(
        io.grpc.photo.PhotoSearchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPublicPhotosMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PUBLIC_PHOTOS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PhotoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PhotoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PUBLIC_PHOTOS:
          serviceImpl.getPublicPhotos((io.grpc.photo.PhotoSearchRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.photo.PhotoResult>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PhotoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PhotoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.photo.FlickrPhotoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PhotoService");
    }
  }

  private static final class PhotoServiceFileDescriptorSupplier
      extends PhotoServiceBaseDescriptorSupplier {
    PhotoServiceFileDescriptorSupplier() {}
  }

  private static final class PhotoServiceMethodDescriptorSupplier
      extends PhotoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PhotoServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PhotoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PhotoServiceFileDescriptorSupplier())
              .addMethod(getGetPublicPhotosMethod())
              .build();
        }
      }
    }
    return result;
  }
}
