package org.techforumist.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.techforumist.jwt.domain.Contrato;
import org.techforumist.jwt.repository.ContratoRepository;

@Service
public class ContratoService {

	@Autowired
	private ContratoRepository contratoRepository;

	public List<Contrato> findAll() {
		return (List<Contrato>) contratoRepository.findAll();
	}

	public Contrato findById(Long id) {
		return contratoRepository.findOne(id);
	}

	public Contrato save(Contrato person) {
		return contratoRepository.save(person);
	}

	public Page<Contrato> findByNome(Pageable p) {
		return contratoRepository.findByNome(p);
	}
	public Page<Contrato> findInativo(Pageable p) {
		return contratoRepository.findInativo(p);
	}

	public void delete(Long id) {
		contratoRepository.delete(id);
	}

}
