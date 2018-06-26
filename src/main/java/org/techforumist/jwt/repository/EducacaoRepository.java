package org.techforumist.jwt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.techforumist.jwt.domain.Educacao;

@Repository
public interface EducacaoRepository extends CrudRepository<Educacao, Long> {

}
