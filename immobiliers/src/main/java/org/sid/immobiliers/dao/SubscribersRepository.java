package org.sid.immobiliers.dao;

import org.sid.immobiliers.entities.Subscribers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestController

@CrossOrigin("*")
public interface SubscribersRepository extends JpaRepository<Subscribers,Long> {
}
