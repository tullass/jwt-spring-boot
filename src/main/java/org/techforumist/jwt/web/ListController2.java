package org.techforumist.jwt.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.techforumist.jwt.domain.Prestacao;
import org.techforumist.jwt.enums.Pronvicia;
import org.techforumist.jwt.service.PrestacaoService;

@RestController
@RequestMapping("prestaa")
public class ListController2 {

	@Autowired
	private PrestacaoService personService;

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> listA(Pageable p) {
		return new ResponseEntity<>(personService.findByNome(p), HttpStatus.OK);
	}
	@RequestMapping(value = "/listarr", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> list( ) {
		return new ResponseEntity<>(personService.findAll(), HttpStatus.OK);
	}
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<Prestacao> createUser(@RequestBody Prestacao appUser) {
		return new ResponseEntity<Prestacao>(personService.save(appUser), HttpStatus.CREATED);
	}
	@GetMapping(path = "a/{id}")
	public ResponseEntity<?> hsj(@PathVariable("id") Long id) {
		Prestacao p = personService.findById(id);

		return new ResponseEntity<>(p, HttpStatus.OK);
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
