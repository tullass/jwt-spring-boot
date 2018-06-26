package org.techforumist.jwt.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Pessoa {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;
	private String apelido;
	private String idade;
	private String email;
	private String telefoneI;
	private String telefoneII;
	private String nuit;
	private String dependentes;
	private String inss;
	private String nib;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefoneI() {
		return telefoneI;
	}

	public void setTelefoneI(String telefoneI) {
		this.telefoneI = telefoneI;
	}

	public String getTelefoneII() {
		return telefoneII;
	}

	public void setTelefoneII(String telefoneII) {
		this.telefoneII = telefoneII;
	}

	public String getNuit() {
		return nuit;
	}

	public void setNuit(String nuit) {
		this.nuit = nuit;
	}

	public String getDependentes() {
		return dependentes;
	}

	public void setDependentes(String dependentes) {
		this.dependentes = dependentes;
	}

	public String getInss() {
		return inss;
	}

	public void setInss(String inss) {
		this.inss = inss;
	}

	public String getNib() {
		return nib;
	}

	public void setNib(String nib) {
		this.nib = nib;
	}

}
