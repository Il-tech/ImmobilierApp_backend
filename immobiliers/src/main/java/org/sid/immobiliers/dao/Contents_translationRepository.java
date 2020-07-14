package org.sid.immobiliers.dao;

import org.sid.immobiliers.entities.Content_translation;
import org.sid.immobiliers.entities.Contents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestController

@CrossOrigin("*")
public interface Contents_translationRepository extends JpaRepository<Content_translation,Long> {
}
