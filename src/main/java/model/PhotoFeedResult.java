package model;

import java.util.ArrayList;
import java.util.List;

public class PhotoFeedResult {
    List<PhotoFeedItem> items;

    public PhotoFeedResult() {
        items = new ArrayList<>();
    }

    public List<PhotoFeedItem> getItems() {
        return items;
    }

    public void setItems(List<PhotoFeedItem> items) {
        this.items = items;
    }
}
