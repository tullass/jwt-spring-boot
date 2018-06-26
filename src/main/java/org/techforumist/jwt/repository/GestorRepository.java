package org.techforumist.jwt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.techforumist.jwt.domain.Gestor;

@Repository
public interface GestorRepository extends CrudRepository<Gestor, Long> {

}
