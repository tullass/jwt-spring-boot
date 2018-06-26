package org.techforumist.jwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techforumist.jwt.domain.Gestor;
import org.techforumist.jwt.repository.GestorRepository;

@Service
public class GestorService {

	@Autowired
	private GestorRepository agestorRepository;

	public Object findAll() {
		return agestorRepository.findAll();
	}

	public Gestor findById(Long id) {
		return agestorRepository.findOne(id);
	}

	public Gestor save(Gestor agestor) {
		return agestorRepository.save(agestor);
	}

	public void delete(Long id) {
		agestorRepository.delete(id);
		return;
	}
}
