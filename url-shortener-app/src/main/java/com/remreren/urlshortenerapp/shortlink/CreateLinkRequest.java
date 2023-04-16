package com.remreren.urlshortenerapp.shortlink;

public class CreateLinkRequest {

    private String link;

    private String name;

    private String description;

    public CreateLinkRequest(String link, String name, String description) {
        this.link = link;
        this.name = name;
        this.description = description;
    }

    public CreateLinkRequest() {
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
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
