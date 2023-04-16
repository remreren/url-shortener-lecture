package com.remreren.urlshortenerapp.shortlink;

public class CreateLinkResponse {

    private Long shortLink;

    private String longLink;

    private String name;

    private String description;

    public CreateLinkResponse(Long shortLink, String longLink, String name, String description) {
        this.shortLink = shortLink;
        this.longLink = longLink;
        this.name = name;
        this.description = description;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
