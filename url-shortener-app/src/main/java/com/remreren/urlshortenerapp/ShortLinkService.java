package com.remreren.urlshortenerapp;

import org.springframework.stereotype.Service;

@Service
public class ShortLinkService {

    private final ShortLinkRepository shortLinkRepository;

    public ShortLinkService(ShortLinkRepository shortLinkRepository) {
        this.shortLinkRepository = shortLinkRepository;
    }

    public CreateLinkResponse createLink(CreateLinkRequest request) {
        var entity = new ShortLinkEntity(request.getLink());
        var created = shortLinkRepository.save(entity);
        return new CreateLinkResponse(created.getShortLink(), created.getLongLink());
    }

    public ShortLinkEntity getShortLink(Long shortLink) {
        return shortLinkRepository.findById(shortLink).orElseThrow(RuntimeException::new);
    }
}
