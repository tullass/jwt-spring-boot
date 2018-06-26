package org.techforumist.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.techforumist.jwt.domain.Consultor;
import org.techforumist.jwt.repository.ConsultorRepository;

@Service
public class ConsultorService {

	@Autowired
	private ConsultorRepository contratoRepository;

	
	public List<Consultor> findAll() {
		return (List<Consultor>) contratoRepository.findAll();
	}

	public Consultor findById(Long id) {
		return contratoRepository.findOne(id);
	}

	public Consultor save(Consultor person) {
		return contratoRepository.save(person);
	}

	public Page<Consultor> findByNome(Pageable p) {
		return contratoRepository.findByNome(p);
	}
	public Page<Consultor> findInativo(Pageable p) {
		return contratoRepository.findInativo(p);
	}

	public void delete(Long id) {
		contratoRepository.delete(id);
	}

}
