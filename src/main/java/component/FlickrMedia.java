package component;

public enum FlickrMedia {
    ALL("all"),
    PHOTOS("photos"),
    VIDEOS("videos");

    private String value;

    FlickrMedia(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
