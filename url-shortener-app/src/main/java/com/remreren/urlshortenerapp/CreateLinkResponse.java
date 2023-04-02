package com.remreren.urlshortenerapp;

public class CreateLinkResponse {
    private Long shortLink;
    private String longLink;

    public CreateLinkResponse(Long shortLink, String longLink) {
        this.shortLink = shortLink;
        this.longLink = longLink;
    }

    public CreateLinkResponse() {
    }

    public Long getShortLink() {
        return shortLink;
    }

    public void setShortLink(Long shortLink) {
        this.shortLink = shortLink;
    }

    public String getLongLink() {
        return longLink;
    }

    public void setLongLink(String longLink) {
        this.longLink = longLink;
    }
}
