package org.sid.immobiliers.dao;

import org.sid.immobiliers.entities.Property_user;
import org.sid.immobiliers.entities.Sliders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestController

@CrossOrigin("*")
public interface SlidersRepository extends JpaRepository<Sliders,Long> {
}
