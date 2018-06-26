package org.techforumist.jwt.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.techforumist.jwt.domain.Prestacao;
import org.techforumist.jwt.service.PrestacaoService;

@RestController
@RequestMapping("prestainative")
public class InativaPrestaController2 {

	@Autowired
	private PrestacaoService personService;

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> listA(Pageable p) {
		return new ResponseEntity<>(personService.findByNome(p), HttpStatus.OK);
	}

//	@RequestMapping(value = "/listarinat", method = RequestMethod.GET)
//	@ResponseBody
//	public Object indexx() {
//		return personService.findAllByAtivo(false);
//	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<Prestacao> createUser(@RequestBody Prestacao appUser) {
		appUser.setAtivo(false);
		return new ResponseEntity<Prestacao>(personService.save(appUser), HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<?> updd(@RequestBody Prestacao departamento) {
		departamento.setAtivo(false);

		personService.save(departamento);
		return new ResponseEntity<>(HttpStatus.OK);

	}

}
