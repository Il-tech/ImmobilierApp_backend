package org.sid.immobiliers.dao;

import org.sid.immobiliers.entities.Slider_translations;
import org.sid.immobiliers.entities.Sliders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestController

@CrossOrigin("*")
public interface Sliders_translationRepository extends JpaRepository<Slider_translations,Long> {
}
