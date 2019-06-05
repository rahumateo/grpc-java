import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.photo.PhotoResult;
import io.grpc.photo.PhotoSearchRequest;
import io.grpc.stub.ServerCallStreamObserver;
import io.grpc.stub.StreamObserver;
import rpccomponent.RPCComponent;
import service.GreeterServiceRpcImpl;
import service.PhotoServiceRpcImpl;

import java.io.IOException;
import java.util.logging.Logger;

public class FlickrFetcherServer {
    private static final Logger logger = Logger.getLogger(FlickrFetcherServer.class.getName());

    private Server server;

    private static PhotoServiceRpcImpl photoServiceRpc;
    private static GreeterServiceRpcImpl greeterServiceRpc;

    private final int PORT = 50051;

    /**
     * Await termination on the main thread since the grpc library uses daemon threads.
     */
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        FlickrFetcherServer fetcherApplication = new FlickrFetcherServer();

        fetcherApplication.initServer();
        fetcherApplication.start();

        fetcherApplication.blockUntilShutdown();
    }

    private void initServer() {
        RPCComponent rpcComponent = new RPCComponent();

        photoServiceRpc = rpcComponent.getPhotoServiceRpc();
        greeterServiceRpc = rpcComponent.getGreeterServiceRpc();

        server = ServerBuilder.forPort(PORT)
                // add services
                .addService(photoServiceRpc)
                .addService(greeterServiceRpc)

                .build();
    }

    private void start() throws IOException {
        /* The port on which the server should run */
        server = server.start();
        logger.info("Server started, listening on " + PORT);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                FlickrFetcherServer.this.stop();
                System.err.println("*** server shutting down");
            }
        });
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    private static void testGetPhotos() {
        StreamObserver<PhotoResult> resultObserver = new ServerCallStreamObserver<PhotoResult>() {
            @Override
            public boolean isCancelled() {
                return false;
            }

            @Override
            public void setOnCancelHandler(Runnable onCancelHandler) {

            }

            @Override
            public void setCompression(String compression) {

            }

            @Override
            public boolean isReady() {
                return false;
            }

            @Override
            public void setOnReadyHandler(Runnable onReadyHandler) {

            }

            @Override
            public void disableAutoInboundFlowControl() {

            }

            @Override
            public void request(int count) {

            }

            @Override
            public void setMessageCompression(boolean enable) {

            }

            @Override
            public void onNext(PhotoResult value) {

            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                System.out.println("fetch completed");
            }
        };

        PhotoSearchRequest request = PhotoSearchRequest.newBuilder().setTags("house").build();
        photoServiceRpc.getPublicPhotos(request, resultObserver);
    }
}
