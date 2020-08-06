package org.sid.immobiliers.dao;

import org.sid.immobiliers.entities.Password_reset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestController

@CrossOrigin("*")
public interface Password_ResetRepository extends JpaRepository<Password_reset,String> {
}
