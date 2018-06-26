package org.techforumist.jwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techforumist.jwt.domain.Posiccao;
import org.techforumist.jwt.repository.PosiccaoRepository;

@Service
public class PosiccaoService {

	@Autowired
	private PosiccaoRepository posiccaoRepository;

	public Object findAll() {
		return posiccaoRepository.findAll();
	}

	public Posiccao findById(Long id) {
		return posiccaoRepository.findOne(id);
	}

	public Posiccao save(Posiccao posiccao) {
		return posiccaoRepository.save(posiccao);
	}

	public void delete(Long id) {
		posiccaoRepository.delete(id);
		return;
	}
}
