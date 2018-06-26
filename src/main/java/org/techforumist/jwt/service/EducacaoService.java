package org.techforumist.jwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techforumist.jwt.domain.Educacao;
import org.techforumist.jwt.repository.EducacaoRepository;

@Service
public class EducacaoService {

	@Autowired
	private EducacaoRepository educacaoRepository;

	public Object findAll() {
		return educacaoRepository.findAll();
	}

	public Educacao findById(Long id) {
		return educacaoRepository.findOne(id);
	}

	public Educacao save(Educacao educacao) {
		return educacaoRepository.save(educacao);
	}

	public void delete(Long id) {
		educacaoRepository.delete(id);
		return;
	}
}
