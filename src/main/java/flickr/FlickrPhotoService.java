package flickr;

import com.flickr4java.flickr.FlickrException;
import com.flickr4java.flickr.photos.Photo;

import java.util.List;

public interface FlickrPhotoService {
    List<Photo> getPublicFeeds(String tags) throws FlickrException;
}
