package org.techforumist.jwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techforumist.jwt.domain.Supervisor;
import org.techforumist.jwt.repository.SupervisorRepository;

@Service
public class SupervisorService {

	@Autowired
	private SupervisorRepository supervisorRepository;

	public Object findAll() {
		return supervisorRepository.findAll();
	}

	public Supervisor findById(Long id) {
		return supervisorRepository.findOne(id);
	}

	public Supervisor save(Supervisor supervisor) {
		return supervisorRepository.save(supervisor);
	}

	public void delete(Long id) {
		supervisorRepository.delete(id);
		return;
	}
}
