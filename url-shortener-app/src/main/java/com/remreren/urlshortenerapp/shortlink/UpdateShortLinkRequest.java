package com.remreren.urlshortenerapp.shortlink;

public class UpdateShortLinkRequest {

    private final String name;

    private final String description;

    public UpdateShortLinkRequest(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
