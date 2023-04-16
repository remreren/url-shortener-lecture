package com.remreren.urlshortenerapp.shortlink;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShortLinkRepository extends JpaRepository<ShortLinkEntity, Long> {
}
