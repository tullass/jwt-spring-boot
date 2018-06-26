package org.techforumist.jwt.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.techforumist.jwt.domain.Prestacao;

@Repository
public interface PrestacaoRepository extends CrudRepository<Prestacao, Long> {

	@Query("SELECT c FROM Prestacao c WHERE c.ativo=true")
	public Page<Prestacao> findByNome(Pageable page);

	public List<Prestacao> findAllByAtivo(Boolean estado);

}
