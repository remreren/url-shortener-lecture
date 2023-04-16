package com.remreren.urlshortenerapp.shortlink;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ShortLinkService {

    private final ShortLinkRepository shortLinkRepository;

    public ShortLinkService(ShortLinkRepository shortLinkRepository) {
        this.shortLinkRepository = shortLinkRepository;
    }

    public CreateLinkResponse createLink(CreateLinkRequest request) {
        var entity = new ShortLinkEntity(request.getLink(),
                                         request.getName(),
                                         request.getDescription());

        var created = shortLinkRepository.save(entity);

        return new CreateLinkResponse(created.getShortLink(),
                                      created.getLongLink(),
                                      created.getName(),
                                      created.getDescription());
    }

    public boolean deleteLink(Long shortLink) {
        var entity = shortLinkRepository.findById(shortLink);

        if (entity.isEmpty()) {
            return false;
        }

        shortLinkRepository.deleteById(shortLink);
        return true;
    }

    public Optional<LinkDetailsResponse> getShortLink(Long shortLink) {
        return shortLinkRepository.findById(shortLink)
                                  .map(ent -> new LinkDetailsResponse(ent.getShortLink(),
                                                                      ent.getLongLink(),
                                                                      ent.getName(),
                                                                      ent.getDescription()));
    }

    public Optional<ShortLinkUpdatedResponse> updateShortLink(Long shortLink, UpdateShortLinkRequest shortLinkDetails) {
        return shortLinkRepository.findById(shortLink)
                                  .map(ent -> updateShortLink(ent, shortLinkDetails))
                                  .map(shortLinkRepository::save)
                                  .map(ent -> new ShortLinkUpdatedResponse(ent.getShortLink(), ent.getLongLink(), ent.getName(), ent.getDescription()));
    }

    private ShortLinkEntity updateShortLink(ShortLinkEntity entity, UpdateShortLinkRequest shortLinkDetails) {

        if (shortLinkDetails.getName() != null) {
            entity.setName(shortLinkDetails.getName());
        }

        if (shortLinkDetails.getDescription() != null) {
            entity.setDescription(shortLinkDetails.getDescription());
        }

        return entity;
    }

    public boolean shortLinkActivation(Long shortLink, boolean active) {
        var entity = shortLinkRepository.findById(shortLink);

        if (entity.isEmpty()) {
            return false;
        }

        entity.get().setActive(active);
        shortLinkRepository.save(entity.get());
        return true;
    }

}
