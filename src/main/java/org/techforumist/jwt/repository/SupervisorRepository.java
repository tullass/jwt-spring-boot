package org.techforumist.jwt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.techforumist.jwt.domain.Supervisor;

@Repository
public interface SupervisorRepository extends CrudRepository<Supervisor, Long> {

}
