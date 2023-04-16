package com.remreren.urlshortenerapp.shortlink;

public class LinkDetailsResponse {

    private final Long shortLink;

    private final String longLink;

    private final String name;

    private final String description;

    public LinkDetailsResponse(Long shortLink, String longLink, String name, String description) {
        this.shortLink = shortLink;
        this.longLink = longLink;
        this.name = name;
        this.description = description;
    }

    public Long getShortLink() {
        return shortLink;
    }

    public String getLongLink() {
        return longLink;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
