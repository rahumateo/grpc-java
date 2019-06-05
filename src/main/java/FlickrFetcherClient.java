import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.helloworld.GreeterGrpc;
import io.grpc.helloworld.HelloReply;
import io.grpc.helloworld.HelloRequest;
import io.grpc.photo.PhotoResult;
import io.grpc.photo.PhotoSearchRequest;
import io.grpc.photo.PhotoServiceGrpc;

import java.util.Scanner;
import java.util.logging.Logger;

public class FlickrFetcherClient {
    private static final Logger logger = Logger.getLogger(FlickrFetcherClient.class.getName());

    private ManagedChannel channel;
    // use BlockingStub for sync. For async with callback, we can use Stub
    private PhotoServiceGrpc.PhotoServiceBlockingStub photoServiceBlockingStub;
    private GreeterGrpc.GreeterBlockingStub greeterBlockingStub;


    private final Scanner scanner = new Scanner(System.in);

    private final String HOST = "localhost";
    private final int PORT = 50051;

    public static void main(String[] args) {
        FlickrFetcherClient client = new FlickrFetcherClient();
        client.initClient();
        client.start();
    }

    private void initClient() {
        logger.info("init Client ...");
        channel = ManagedChannelBuilder
                .forAddress(HOST, PORT)
                // Channels are secure by default (via SSL/TLS).
                // Disabling TLS to avoid the need of certificates.
                .usePlaintext()
                .build();
        photoServiceBlockingStub = PhotoServiceGrpc.newBlockingStub(channel);
        greeterBlockingStub = GreeterGrpc.newBlockingStub(channel);
    }

    private void start() {
        while (true) {
            logger.info("type GREET to greet or PHOTO to search Flickr's photo with tag.\n(or EXIT to terminate)");
            String command = scanner.next();

            if (command.equalsIgnoreCase("EXIT")) {
                logger.info("Client shutting down ...");
                break;
            } else if (command.equalsIgnoreCase("GREET")) {
                greet();
            } else if (command.equalsIgnoreCase("PHOTO")) {
                logger.info("Type in tags you want to search for: (or EXIT to terminate)");
                String tags = scanner.next();

                if (tags.equals("EXIT")) {
                    break;
                } else {
                    getFlickrPhoto(tags);
                }
            } else {
                logger.info("command not found.");
            }
        }
    }

    private void greet() {
        logger.info("Please enter your name: ");

        HelloRequest request = HelloRequest.newBuilder().setName(scanner.next()).build();
        HelloReply reply = greeterBlockingStub.sayGreeting(request);
        logger.info(reply.getMessage());
    }

    private void getFlickrPhoto(String tags) {
        PhotoSearchRequest request = PhotoSearchRequest.newBuilder().setTags(tags)
                .build();

        logger.info("searching photos for: " + tags);
        PhotoResult result = photoServiceBlockingStub.getPublicPhotos(request);
        logger.info("Got " + result.getPhotosCount() + " for tags: " + tags);
    }
}
