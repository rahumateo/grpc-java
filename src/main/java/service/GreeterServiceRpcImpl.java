package service;

import io.grpc.helloworld.GreeterGrpc;
import io.grpc.helloworld.HelloReply;
import io.grpc.helloworld.HelloRequest;
import io.grpc.stub.StreamObserver;

public class GreeterServiceRpcImpl extends GreeterGrpc.GreeterImplBase {

    public GreeterServiceRpcImpl() {
    }

    @Override
    public void sayGreeting(HelloRequest helloRequest, StreamObserver<HelloReply> replyStreamObserver) {
        String name = helloRequest.getName();

        replyStreamObserver.onNext(HelloReply.newBuilder().setMessage("Valar Morghulis " + name).build());
        replyStreamObserver.onCompleted();
    }
}
