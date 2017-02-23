package com.johnreis.instituto.firstdayapp.entities;

/**
 * Created by Instituto on 16/02/2017.
 */

public class Books {
    private String title, url;

    public Books() {
    }

    public Books(String title, String url) {
        this.title = title;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
