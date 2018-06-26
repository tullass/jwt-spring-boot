package org.techforumist.jwt.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.techforumist.jwt.domain.Consultor;

@Repository
public interface ConsultorRepository extends CrudRepository<Consultor, Long> {
	@Query("SELECT c FROM Consultor c WHERE c.ativo=true")
	public Page<Consultor> findByNome(Pageable page);
	
	@Query("SELECT c FROM Consultor c WHERE c.ativo=false")
	public Page<Consultor> findInativo(Pageable page);

}


