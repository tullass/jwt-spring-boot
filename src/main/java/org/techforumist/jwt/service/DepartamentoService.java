package org.techforumist.jwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techforumist.jwt.domain.Departamento;
import org.techforumist.jwt.repository.DepartamentoRepository;

@Service
public class DepartamentoService {

	@Autowired
	private DepartamentoRepository departamentoRepository;

	public Object findAll() {
		return departamentoRepository.findAll();
	}

	public Departamento findById(Long id) {
		return departamentoRepository.findOne(id);
	}

	public Departamento save(Departamento departamento) {
		return departamentoRepository.save(departamento);
	}

	public void delete(Long id) {
		departamentoRepository.delete(id);
		return;
	}
}
