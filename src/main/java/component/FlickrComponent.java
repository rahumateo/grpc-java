package component;

import flickr.FlickrPhotoService;
import flickr.FlickrPhotoServiceImpl;

public class FlickrComponent {
    /*
    * Currently only has service for photo (using PhotoInterface, see implementation)
    * */
    private FlickrPhotoService photoService;

    private FlickrConfig config;

    public FlickrComponent() {
        config = new FlickrConfig();

        photoService = new FlickrPhotoServiceImpl(config);
    }


    public FlickrPhotoService getPhotoService() {
        return photoService;
    }
}
