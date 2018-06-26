package org.techforumist.jwt.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.techforumist.jwt.domain.Contrato;
import org.techforumist.jwt.service.ContratoService;

@RestController
@RequestMapping("apagar")
public class ApagarController {

	@Autowired
	private ContratoService personService;

//	@RequestMapping(value = "/listar", method = RequestMethod.GET)
//	@ResponseBody
//	public Object index() {
//		return personService.findAllByEstado(true);
//	}

//	@RequestMapping(value = "/listarinat", method = RequestMethod.GET)
//	@ResponseBody
//	public Object indexx() {
//		return personService.findAllByActivo(false);
//	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<Contrato> createUser(@RequestBody Contrato appUser) {
	//	appUser.setEstado(false);
		appUser.setAtivo(false);
		return new ResponseEntity<Contrato>(personService.save(appUser), HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<?> updd(@RequestBody Contrato departamento) {
		departamento.setAtivo(false);

		personService.save(departamento);
		return new ResponseEntity<>(HttpStatus.OK);

	}

}
