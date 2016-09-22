package com.maggard.masterdetailflowdemo.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;

    static {
        // Add 3 sample items.
        addItem(new DummyItem("1","Google","http://google.com"));
        addItem(new DummyItem("2","Coleman","http://coleman.edu"));
        addItem(new DummyItem("3","Amazon","http://amazon.com"));
        }


    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;

        //change these two strings from content and details to website name(content) and website url (details)
        public final String website_name;
        public final String website_url;

        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.website_name = content;
            this.website_url = details;
        }

        @Override
        public String toString() {
            return website_name;
        } //changes tostring to read website name instead of content
    }
}
