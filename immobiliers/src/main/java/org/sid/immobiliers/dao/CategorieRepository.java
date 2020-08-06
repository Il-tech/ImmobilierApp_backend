package org.sid.immobiliers.dao;

import org.sid.immobiliers.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin ("*")
public interface CategorieRepository extends JpaRepository<Category,Long> {

}
