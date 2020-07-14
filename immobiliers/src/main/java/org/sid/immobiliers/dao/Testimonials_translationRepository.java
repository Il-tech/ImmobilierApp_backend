package org.sid.immobiliers.dao;

import org.sid.immobiliers.entities.Testimonial_translations;
import org.sid.immobiliers.entities.Testimonials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestController

@CrossOrigin("*")

public interface Testimonials_translationRepository extends JpaRepository<Testimonial_translations,Long> {
}
