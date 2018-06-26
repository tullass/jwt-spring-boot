package org.techforumist.jwt.service;

import java.util.List;
import java.util.Map;

import org.techforumist.jwt.domain.Contrato;

public interface PrintService {

	public Iterable<Contrato> findAll();

	public Contrato find(Long id);

	public List<Map<String, Object>> report();
}
