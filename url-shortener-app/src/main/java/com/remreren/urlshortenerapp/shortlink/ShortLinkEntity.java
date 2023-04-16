package com.remreren.urlshortenerapp.shortlink;

import jakarta.persistence.*;

@Entity(name = "short_url")
public class ShortLinkEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long shortLink;

    private String longLink;

    private String name;

    private String description;

    private Boolean active = Boolean.TRUE;

    public ShortLinkEntity(String longLink, String name, String description) {
        this.longLink = longLink;
        this.name = name;
        this.description = description;
    }

    public ShortLinkEntity() {
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

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
