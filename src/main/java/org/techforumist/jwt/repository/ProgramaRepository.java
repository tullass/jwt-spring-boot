package org.techforumist.jwt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.techforumist.jwt.domain.Programa;

@Repository
public interface ProgramaRepository extends CrudRepository<Programa, Long> {

}
