package org.techforumist.jwt.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.techforumist.jwt.domain.Consultor;
import org.techforumist.jwt.enums.Pronvicia;
import org.techforumist.jwt.service.ConsultorService;

@RestController
@RequestMapping("consull")
public class ListController3 {

	@Autowired
	private ConsultorService personService;

	

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<Consultor> createUser(@RequestBody Consultor appUser) {
		return new ResponseEntity<Consultor>(personService.save(appUser), HttpStatus.CREATED);
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
