package org.sid.immobiliers.dao;

import org.sid.immobiliers.entities.type_transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestController
@CrossOrigin("*")
public interface type_transaction_repository extends JpaRepository<type_transaction, Long> {
}
