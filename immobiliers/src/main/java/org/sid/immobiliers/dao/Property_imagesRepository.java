package org.sid.immobiliers.dao;

import org.sid.immobiliers.entities.Properties;
import org.sid.immobiliers.entities.Property_images;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestController

@CrossOrigin("*")
public interface Property_imagesRepository extends JpaRepository<Property_images,Long> {
}
