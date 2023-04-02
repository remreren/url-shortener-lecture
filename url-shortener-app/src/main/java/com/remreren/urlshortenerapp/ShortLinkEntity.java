package com.remreren.urlshortenerapp;

import jakarta.persistence.*;

@Entity(name = "short_url")
public class ShortLinkEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long shortLink;

    private String longLink;

    public ShortLinkEntity(String longLink) {
        this.longLink = longLink;
    }

    public ShortLinkEntity() {
    }

    public void setShortLink(Long shortLink) {
        this.shortLink = shortLink;
    }

    public Long getShortLink() {
        return shortLink;
    }

    public String getLongLink() {
        return longLink;
    }

    public void setLongLink(String longLink) {
        this.longLink = longLink;
    }
}
