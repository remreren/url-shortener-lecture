package com.remreren.urlshortenerapp.redirect;

import com.remreren.urlshortenerapp.shortlink.ShortLinkRepository;
import org.springframework.stereotype.Service;

@Service
public class RedirectService {

    private final ShortLinkRepository shortLinkRepository;

    public RedirectService(ShortLinkRepository shortLinkRepository) {
        this.shortLinkRepository = shortLinkRepository;
    }

    public ShortLinkDTO getShortLink(Long shortLink) {
        var linkEntity = shortLinkRepository.findById(shortLink).orElseThrow(RuntimeException::new);
        return new ShortLinkDTO(linkEntity.getShortLink(), linkEntity.getLongLink(), linkEntity.getActive());
    }
}
