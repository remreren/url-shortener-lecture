package com.remreren.urlshortenerapp.redirect;

public class ShortLinkDTO {

    private final Long shortLink;
    private final String longLink;

    private final Boolean active;

    public ShortLinkDTO(Long shortLink, String longLink, Boolean active) {
        this.shortLink = shortLink;
        this.longLink = longLink;
        this.active = active;
    }

    public Long getShortLink() {
        return shortLink;
    }

    public String getLongLink() {
        return longLink;
    }

    public Boolean getActive() {
        return active;
    }
}
