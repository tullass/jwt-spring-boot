package org.techforumist.jwt.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.techforumist.jwt.domain.Contrato;
import org.techforumist.jwt.enums.Pronvicia;
import org.techforumist.jwt.service.ContratoService;

@RestController
@RequestMapping("listaa")
public class ListController {

	@Autowired
	private ContratoService personService;
	@Autowired
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> listAlldd() {
		return new ResponseEntity<>(personService.findAll(), HttpStatus.OK);
	}

	@RequestMapping(value = "/listarF", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> lists(Pageable p) {
		return new ResponseEntity<>(personService.findInativo(p), HttpStatus.OK);
	}
	@RequestMapping(value = "/listarV", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> listss(Pageable p) {
		return new ResponseEntity<>(personService.findByNome(p), HttpStatus.OK);
	}


	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<Contrato> createUser(@RequestBody Contrato appUser) {
		appUser.setAtivo(false);
		return new ResponseEntity<Contrato>(personService.save(appUser), HttpStatus.CREATED);
	}


	@RequestMapping("/userrr/pronviciaa")
	public List<String> getPronvicia() {
		List<String> profiles = new ArrayList<>();
		for (Pronvicia profile : Pronvicia.values()) {
			profiles.add(profile.name());
		}
		return profiles;
	}
}
