package org.techforumist.jwt.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.techforumist.jwt.domain.Consultor;
import org.techforumist.jwt.enums.Categoria;
import org.techforumist.jwt.enums.Estado;
import org.techforumist.jwt.enums.Graus;
import org.techforumist.jwt.enums.Nivel;
import org.techforumist.jwt.enums.Pronvicia;
import org.techforumist.jwt.service.ConsultorService;
import org.techforumist.jwt.service.DepartamentoService;
import org.techforumist.jwt.service.EducacaoService;
import org.techforumist.jwt.service.GestorService;
import org.techforumist.jwt.service.PosiccaoService;
import org.techforumist.jwt.service.ProgramaService;
import org.techforumist.jwt.service.SupervisorService;

@RestController
@RequestMapping("consultor")
public class ConsultorController {
	@Autowired
	private ConsultorService consultorService;
	@Autowired
	private EducacaoService educacaoService;

	@Autowired
	private DepartamentoService departamentoservice;

	@Autowired
	private GestorService gestorService;

	@Autowired
	private PosiccaoService posiccaoService;

	@Autowired
	private SupervisorService supervisorService;

	@Autowired
	private ProgramaService programaService;

	@RequestMapping(value = "/listarB", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> listA(Pageable p) {
		return new ResponseEntity<>(consultorService.findByNome(p), HttpStatus.OK);
	}

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> listAlld() {
		return new ResponseEntity<>(consultorService.findAll(), HttpStatus.OK);
	}

	@RequestMapping(value = "/areaa", method = RequestMethod.GET)
	@ResponseBody
	public Object areaa() {
		return educacaoService.findAll();
	}

	@RequestMapping(value = "/educacao", method = RequestMethod.GET)
	@ResponseBody
	public Object educacao() {
		return educacaoService.findAll();
	}

	@RequestMapping(value = "/departamento", method = RequestMethod.GET)
	@ResponseBody
	public Object departament() {
		return departamentoservice.findAll();
	}

	@RequestMapping(value = "/gestor", method = RequestMethod.GET)
	@ResponseBody
	public Object gestor() {
		return gestorService.findAll();
	}

	@RequestMapping(value = "/supervisor", method = RequestMethod.GET)
	@ResponseBody
	public Object supervisor() {
		return supervisorService.findAll();
	}

	@RequestMapping(value = "/programa", method = RequestMethod.GET)
	@ResponseBody
	public Object programa() {
		return programaService.findAll();
	}

	@RequestMapping(value = "/posiccao", method = RequestMethod.GET)
	@ResponseBody
	public Object posiccao() {
		return posiccaoService.findAll();
	}

	@GetMapping(path = "a/{id}")
	public ResponseEntity<?> hsj(@PathVariable("id") Long id) {
		Consultor p = consultorService.findById(id);

		return new ResponseEntity<>(p, HttpStatus.OK);
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<Consultor> createUser(@RequestBody Consultor appUser) {
		appUser.setAtivo(true);
		return new ResponseEntity<Consultor>(consultorService.save(appUser), HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<?> updd(@RequestBody Consultor departamento) {
		consultorService.save(departamento);
		return new ResponseEntity<>(HttpStatus.OK);

	}

	@DeleteMapping(path = "/delete/{id}")
	public ResponseEntity<?> deletar(@PathVariable Long id) {
		consultorService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping("/userc/categotia")
	public List<String> getCategoria() {
		List<String> profiles = new ArrayList<>();
		for (Categoria profile : Categoria.values()) {
			profiles.add(profile.name());
		}
		return profiles;

	}

	@RequestMapping("/user/civil")
	public List<String> getEstado() {
		List<String> profiles = new ArrayList<>();
		for (Estado profile : Estado.values()) {
			profiles.add(profile.name());
		}
		return profiles;

	}

	@RequestMapping("/userp/parentes")
	public List<String> getGraus() {
		List<String> profiles = new ArrayList<>();
		for (Graus profile : Graus.values()) {
			profiles.add(profile.name());
		}
		return profiles;

	}

	@RequestMapping("/users/salarial")
	public List<String> getNivel() {
		List<String> profiles = new ArrayList<>();
		for (Nivel profile : Nivel.values()) {
			profiles.add(profile.name());
		}
		return profiles;

	}

	@RequestMapping("/userr/pronvicia")
	public List<String> getPronvicia() {
		List<String> profiles = new ArrayList<>();
		for (Pronvicia profile : Pronvicia.values()) {
			profiles.add(profile.name());
		}
		return profiles;
	}
}
