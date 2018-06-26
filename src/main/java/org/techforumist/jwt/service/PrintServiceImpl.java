package org.techforumist.jwt.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techforumist.jwt.domain.Contrato;
import org.techforumist.jwt.repository.PrintR;

@Service
public class PrintServiceImpl implements PrintService {

	@Autowired
	private PrintR pr;
	
	@Override
	public Iterable<Contrato> findAll() {
	
		return pr.findAll();
	}

	@Override
	public Contrato find(Long id) {
		
		return pr.findOne(id);
	}

	@Override
	public List<Map<String, Object>> report() {
		List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
		for (Contrato car : this.findAll()) {
			Map<String, Object> item = new HashMap<String, Object>();
			item.put("id", car.getId());
			item.put("nome", car.getNome());
			item.put("apelido", car.getApelido());
			result.add(item);
		}
		return result;
	}

}
