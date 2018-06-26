package org.techforumist.jwt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.techforumist.jwt.domain.Departamento;

@Repository
public interface DepartamentoRepository extends CrudRepository<Departamento, Long> {

}
