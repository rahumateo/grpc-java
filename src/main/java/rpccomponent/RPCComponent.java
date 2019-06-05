package rpccomponent;

import component.FlickrComponent;
import service.GreeterServiceRpcImpl;
import service.PhotoServiceRpcImpl;

public class RPCComponent {
    private PhotoServiceRpcImpl photoServiceRpc;
    private GreeterServiceRpcImpl greeterServiceRpc;

    public RPCComponent() {
        FlickrComponent flickrComponent = new FlickrComponent();
        photoServiceRpc = new PhotoServiceRpcImpl(flickrComponent.getPhotoService());
        greeterServiceRpc = new GreeterServiceRpcImpl();
    }

    public PhotoServiceRpcImpl getPhotoServiceRpc() {
        return photoServiceRpc;
    }

    public GreeterServiceRpcImpl getGreeterServiceRpc() {
        return greeterServiceRpc;
    }
}
