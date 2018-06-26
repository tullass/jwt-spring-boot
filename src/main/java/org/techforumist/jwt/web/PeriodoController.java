package org.techforumist.jwt.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.techforumist.jwt.service.ConsultorService;
import org.techforumist.jwt.service.ContratoService;

@RestController
@RequestMapping("periodo")
public class PeriodoController {

	@Autowired
	private ContratoService personService;


	@Autowired
	private ConsultorService consultorService;


	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> listAlld() {
		return new ResponseEntity<>(personService.findAll(), HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/listarConsultor", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> listd() {
		return new ResponseEntity<>(consultorService.findAll(), HttpStatus.OK);
	}
}
