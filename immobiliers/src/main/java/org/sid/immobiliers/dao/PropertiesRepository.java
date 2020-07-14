package org.sid.immobiliers.dao;

import org.sid.immobiliers.entities.Password_reset;
import org.sid.immobiliers.entities.Properties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestController

@CrossOrigin("*")
public interface PropertiesRepository extends JpaRepository<Properties,Long> {
}
