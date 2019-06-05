package service;

import com.flickr4java.flickr.FlickrException;
import com.flickr4java.flickr.photos.Photo;
import flickr.FlickrPhotoService;
import io.grpc.photo.PhotoResult;
import io.grpc.photo.PhotoSearchRequest;
import io.grpc.photo.PhotoServiceGrpc;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class PhotoServiceRpcImpl extends PhotoServiceGrpc.PhotoServiceImplBase {
    private static final Logger logger = Logger.getLogger(PhotoServiceRpcImpl.class.getName());
    private FlickrPhotoService fickrPhotoService;

    public PhotoServiceRpcImpl(FlickrPhotoService photoService) {
        fickrPhotoService = photoService;
    }

    @Override
    public void getPublicPhotos(PhotoSearchRequest request, StreamObserver<PhotoResult> resultObserver) {
        try {
            resultObserver.onNext(getFlickrPhotos(request.getTags()));
            resultObserver.onCompleted();
        } catch (FlickrException e) {
            resultObserver.onError(new IllegalStateException(e.getErrorMessage()));
        }
    }

    public PhotoResult getFlickrPhotos(String tags) throws FlickrException {
        List<Photo> flickrPhotos = fickrPhotoService.getPublicFeeds(tags);

        return convertFlickrPhotos(tags, flickrPhotos);
    }

    private PhotoResult convertFlickrPhotos(String tags, List<Photo> flickrPhotos) {
        PhotoResult.Builder resultBuilder = PhotoResult.newBuilder();
        resultBuilder.setTitle(tags);

        List<io.grpc.photo.Photo> photos = new ArrayList<>();
        for (Photo photo : flickrPhotos) {
            photos.add(convertFlickrPhoto(photo));
        }
        resultBuilder.addAllPhotos(photos);

        return resultBuilder.build();
    }

    private io.grpc.photo.Photo convertFlickrPhoto(Photo flickrPhoto) {
        io.grpc.photo.Photo.Builder photoItemBuilder = io.grpc.photo.Photo.newBuilder();

        photoItemBuilder.setTitle(flickrPhoto.getTitle() != null ? flickrPhoto.getTitle() : "");
        photoItemBuilder.setDescription(flickrPhoto.getDescription() != null ? flickrPhoto.getDescription() : "");

        if (flickrPhoto.getOwner() != null) {
            photoItemBuilder.setAuthor(flickrPhoto.getOwner().getUsername() != null ? flickrPhoto.getOwner().getUsername() : "");
        }

        /*
        * available size and priority: Thumbnail, Square, Original
        * */
        try {
            String url = "";
            if (flickrPhoto.getThumbnailUrl() != null) {
                url = flickrPhoto.getThumbnailUrl();
            } else if (flickrPhoto.getSmallSquareUrl() != null) {
                url = flickrPhoto.getSmallSquareUrl();
            } else {
                url = flickrPhoto.getOriginalUrl();
            }
            photoItemBuilder.setUrl(url);
        } catch (FlickrException e) {
            logger.info("error on getting org url");
        }

        return photoItemBuilder.build();
    }
}
