package org.techforumist.jwt.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contactos implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2951928687202755442L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome1;
	private String telefone1;
	private String parente1;

	private String nome2;
	private String telefone2;
	private String parente2;

	private String nome3;
	private String telefone3;
	private String parente3;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome1() {
		return nome1;
	}

	public void setNome1(String nome1) {
		this.nome1 = nome1;
	}

	public String getTelefone1() {
		return telefone1;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	public String getParente1() {
		return parente1;
	}

	public void setParente1(String parente1) {
		this.parente1 = parente1;
	}

	public String getNome2() {
		return nome2;
	}

	public void setNome2(String nome2) {
		this.nome2 = nome2;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public String getParente2() {
		return parente2;
	}

	public void setParente2(String parente2) {
		this.parente2 = parente2;
	}

	public String getNome3() {
		return nome3;
	}

	public void setNome3(String nome3) {
		this.nome3 = nome3;
	}

	public String getTelefone3() {
		return telefone3;
	}

	public void setTelefone3(String telefone3) {
		this.telefone3 = telefone3;
	}

	public String getParente3() {
		return parente3;
	}

	public void setParente3(String parente3) {
		this.parente3 = parente3;
	}

}
