package com.remreren.urlshortenerapp;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ShortUrlRedirectController {

    private final ShortLinkService shortLinkService;

    public ShortUrlRedirectController(ShortLinkService shortLinkService) {
        this.shortLinkService = shortLinkService;
    }

    @GetMapping("/{shortLink}")
    public ResponseEntity<?> redirect(@PathVariable("shortLink") Long shortLink, HttpServletResponse response) {
        var link = shortLinkService.getShortLink(shortLink);
        response.addHeader("Location", link.getLongLink());
        return new ResponseEntity<>(HttpStatusCode.valueOf(302));
    }

}


//        ### Kısa link
//        - [ ] Kısa linke gitme: GET /{shortlink}
//        ### Link -> spring security öncesi
//        - [ ] kısa link oluşturma: POST /link --> TODO
//        - [ ] kısa link güncelleme: PUT /link
//        - [ ] kısa link detayları görüntüleme: GET /link/{shortLink}
//        - [ ] kısa link silme: DELETE /link/{shortlink}
//        - [ ] kısa link deaktive etme: PUT /link/{shortlink}/deactivate
//        - [ ] kısa link aktive etme: PUT /link/{shortlink}/activate