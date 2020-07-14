package org.sid.immobiliers.dao;

import org.sid.immobiliers.entities.Categorie;
import org.sid.immobiliers.entities.Category_translations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestController

@CrossOrigin("*")
public interface Categorie_translationsRepository extends JpaRepository<Category_translations,Long> {
}
