package org.sid.immobiliers.dao;

import org.sid.immobiliers.entities.Admins;
import org.sid.immobiliers.entities.Users;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestController

@CrossOrigin("*")
public interface AdminRepository extends JpaRepository<Admins,Long> {
}
