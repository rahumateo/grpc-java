package flickr;

import com.flickr4java.flickr.Flickr;
import com.flickr4java.flickr.FlickrException;
import com.flickr4java.flickr.REST;
import com.flickr4java.flickr.auth.Auth;
import com.flickr4java.flickr.auth.AuthInterface;
import com.flickr4java.flickr.auth.Permission;
import com.flickr4java.flickr.photos.*;
import com.github.scribejava.core.model.OAuth1RequestToken;
import com.github.scribejava.core.model.OAuth1Token;
import component.FlickrConfig;
import component.FlickrMedia;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Logger;

public class FlickrPhotoServiceImpl implements FlickrPhotoService {
    private static final Logger logger = Logger.getLogger(FlickrPhotoServiceImpl.class.getName());

    private final Scanner scanner = new Scanner(System.in);
    private Flickr flickrService;

    private PhotosInterface photosInterface;
    private AuthInterface authInterface;

    private static final Set<String> EXTRA_TAGS = new HashSet<>();
    static {
        EXTRA_TAGS.add("description");
        EXTRA_TAGS.add(Extras.OWNER_NAME);
        EXTRA_TAGS.add(Extras.MEDIA);
        EXTRA_TAGS.add(Extras.URL_T);
        EXTRA_TAGS.add(Extras.URL_SQ);
        EXTRA_TAGS.add(Extras.URL_O);
    }

    public FlickrPhotoServiceImpl(final FlickrConfig config) {
        flickrService = new Flickr(config.apiKey, config.secretKey, new REST());

        photosInterface = flickrService.getPhotosInterface();
        authInterface = flickrService.getAuthInterface();
    }

    private OAuth1Token authorize() throws FlickrException {
        OAuth1RequestToken requestToken = authInterface.getRequestToken();
        System.out.println("token: " + requestToken);

        String url = authInterface.getAuthorizationUrl(requestToken, Permission.READ);
        System.out.println("Follow this URL to authorise yourself on Flickr");
        System.out.println(url);
        System.out.println("Paste in the token it gives you:");
        System.out.print(">>");

        String tokenKey = scanner.nextLine();
        scanner.close();

        OAuth1Token accessToken = authInterface.getAccessToken(requestToken, tokenKey);
        System.out.println("Authentication success");

        Auth auth = authInterface.checkToken(accessToken);

        // This token can be used until the user revokes it.
        System.out.println("Token: " + accessToken.getToken());
        System.out.println("Secret: " + accessToken.getTokenSecret());
        System.out.println("nsid: " + auth.getUser().getId());
        System.out.println("Realname: " + auth.getUser().getRealName());
        System.out.println("Username: " + auth.getUser().getUsername());
        System.out.println("Permission: " + auth.getPermission().getType());

        return accessToken;
    }

    @Override
    public List<Photo> getPublicFeeds(String tags) throws FlickrException {
//        authorize();

        SearchParameters searchParameters = new SearchParameters();
        searchParameters.setMedia(FlickrMedia.PHOTOS.getValue());
        searchParameters.setExtras(EXTRA_TAGS);
        searchParameters.setText(tags);
        searchParameters.setTags(new String[]{tags});

        logger.info("search Flickr for " + tags);
        PhotoList<Photo> results = photosInterface.search(searchParameters, 20, 0);
        return results;
    }
}
