package com.remreren.urlshortenerapp;

public class CreateLinkRequest {
    private String link;

    public CreateLinkRequest(String link) {
        this.link = link;
    }

    public CreateLinkRequest() {
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
