package org.techforumist.jwt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.techforumist.jwt.domain.Posiccao;

@Repository
public interface PosiccaoRepository extends CrudRepository<Posiccao, Long> {

}
