package org.techforumist.jwt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.techforumist.jwt.domain.Programaa;

@Repository
public interface ProgramaaRepository extends CrudRepository<Programaa, Long> {

}
