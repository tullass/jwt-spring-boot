package org.techforumist.jwt.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.techforumist.jwt.domain.Contrato;

@Repository
public interface ContratoRepository extends PagingAndSortingRepository<Contrato, Long> {

	@Query("SELECT c FROM Contrato c WHERE c.ativo=true")
	public Page<Contrato> findByNome(Pageable page);
	
	@Query("SELECT c FROM Contrato c WHERE c.ativo=false")
	public Page<Contrato> findInativo(Pageable page);


}
