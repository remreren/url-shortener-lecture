package com.remreren.urlshortenerapp.shortlink;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/link")
public class ShortLinkController {

    private final ShortLinkService shortLinkService;

    public ShortLinkController(ShortLinkService shortLinkService) {
        this.shortLinkService = shortLinkService;
    }

    @PostMapping
    public ResponseEntity<CreateLinkResponse> createLink(@RequestBody CreateLinkRequest createLink) {
        var response = shortLinkService.createLink(createLink);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{shortLink}")
    public ResponseEntity<?> deleteLink(@PathVariable("shortLink") Long shortLink) {
        var isDeleted = shortLinkService.deleteLink(shortLink);

        if (isDeleted) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{shortLink}")
    public  ResponseEntity<LinkDetailsResponse> getLinkDetails(@PathVariable("shortLink") Long shortLink) {
        var shortLinkDetails = shortLinkService.getShortLink(shortLink);
        return ResponseEntity.of(shortLinkDetails);
    }

    @PutMapping("/{shortLink}")
    public ResponseEntity<ShortLinkUpdatedResponse> updateShortLink(@PathVariable("shortLink") Long shortLink,
                                                                    @RequestBody UpdateShortLinkRequest shortLinkDetails) {
        var updatedShortLink = shortLinkService.updateShortLink(shortLink, shortLinkDetails);
        return ResponseEntity.of(updatedShortLink);
    }

    @PutMapping("/{shortLink}/deactivate")
    public ResponseEntity<Void> deactivateShortLink(@PathVariable("shortLink") Long shortLink) {
        var updated = shortLinkService.shortLinkActivation(shortLink, false);

        if (updated) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{shortLink}/activate")
    public ResponseEntity<Void> activateShortLink(@PathVariable("shortLink") Long shortLink) {
        var updated = shortLinkService.shortLinkActivation(shortLink, true);

        if (updated) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}