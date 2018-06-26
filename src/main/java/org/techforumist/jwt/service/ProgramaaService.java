package org.techforumist.jwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techforumist.jwt.domain.Programaa;
import org.techforumist.jwt.repository.ProgramaaRepository;

@Service
public class ProgramaaService {

	@Autowired
	private ProgramaaRepository posiccaoRepository;

	public Object findAll() {
		return posiccaoRepository.findAll();
	}

	public Programaa findById(Long id) {
		return posiccaoRepository.findOne(id);
	}

	public Programaa save(Programaa posiccao) {
		return posiccaoRepository.save(posiccao);
	}

	public void delete(Long id) {
		posiccaoRepository.delete(id);
		return;
	}
}
