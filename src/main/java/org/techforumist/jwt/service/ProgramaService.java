package org.techforumist.jwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techforumist.jwt.domain.Programa;
import org.techforumist.jwt.repository.ProgramaRepository;

@Service
public class ProgramaService {

	@Autowired
	private ProgramaRepository programaRepository;

	public Object findAll() {
		return programaRepository.findAll();
	}

	public Programa findById(Long id) {
		return programaRepository.findOne(id);
	}

	public Programa save(Programa programa) {
		return programaRepository.save(programa);
	}

	public void delete(Long id) {
		programaRepository.delete(id);
		return;
	}
}
