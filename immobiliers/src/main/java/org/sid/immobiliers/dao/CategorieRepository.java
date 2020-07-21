package org.sid.immobiliers.dao;

import org.sid.immobiliers.entities.Categorie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@RepositoryRestResource
@CrossOrigin ("*")
public interface CategorieRepository extends JpaRepository<Categorie,Long> {
}
