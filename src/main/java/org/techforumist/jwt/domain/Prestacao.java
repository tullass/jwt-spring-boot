package org.techforumist.jwt.domain;

import java.io.Serializable;
import java.util.GregorianCalendar;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Prestacao implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3100615509727385328L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String apelido;
	private String datainicio;
	private String datafim;
	private String idade;
	private String civil;
	private String nivel;
	private String genero;
	private String telefoneI;
	private String telefoneII;
	private String anos;
	private String salariobase;
	private String salarioatual;
	private String trabalhop;
	private String nbanco;
	private String componete;
	private String ions;
	private String skype;
	private String nib;
	private String exp;
	private String local;
	private String nuit;
	private Boolean ativo;
	GregorianCalendar calendar = new GregorianCalendar();
	private int data = calendar.getWeekYear();

	@ManyToOne
	private Departamento departamento;

	@ManyToOne
	private Educacao educacao;

	@ManyToOne
	private Gestor gestor;

	@ManyToOne
	private Posiccao posicao;

	@ManyToOne
	private Programaa programa;

	@ManyToOne
	private Supervisor supervisor;

	@ManyToOne(cascade = CascadeType.ALL)
	private Endereco endereco;

	@ManyToOne(cascade = CascadeType.ALL)
	private AppUser appUser;
	@ManyToOne(cascade = CascadeType.ALL)
	private Profissional profissional;

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

	public String getDatainicio() {
		return datainicio;
	}

	public void setDatainicio(String datainicio) {
		this.datainicio = datainicio;
	}

	public String getDatafim() {
		return datafim;
	}

	public void setDatafim(String datafim) {
		this.datafim = datafim;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getCivil() {
		return civil;
	}

	public void setCivil(String civil) {
		this.civil = civil;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
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

	public String getAnos() {
		return anos;
	}

	public void setAnos(String anos) {
		this.anos = anos;
	}

	public String getSalariobase() {
		return salariobase;
	}

	public void setSalariobase(String salariobase) {
		this.salariobase = salariobase;
	}

	public String getSalarioatual() {
		return salarioatual;
	}

	public void setSalarioatual(String salarioatual) {
		this.salarioatual = salarioatual;
	}

	public String getTrabalhop() {
		return trabalhop;
	}

	public void setTrabalhop(String trabalhop) {
		this.trabalhop = trabalhop;
	}

	public String getNbanco() {
		return nbanco;
	}

	public void setNbanco(String nbanco) {
		this.nbanco = nbanco;
	}

	public String getComponete() {
		return componete;
	}

	public void setComponete(String componete) {
		this.componete = componete;
	}

	public String getIons() {
		return ions;
	}

	public void setIons(String ions) {
		this.ions = ions;
	}

	public String getSkype() {
		return skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}

	public String getNib() {
		return nib;
	}

	public void setNib(String nib) {
		this.nib = nib;
	}

	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getNuit() {
		return nuit;
	}

	public void setNuit(String nuit) {
		this.nuit = nuit;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public GregorianCalendar getCalendar() {
		return calendar;
	}

	public void setCalendar(GregorianCalendar calendar) {
		this.calendar = calendar;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Educacao getEducacao() {
		return educacao;
	}

	public void setEducacao(Educacao educacao) {
		this.educacao = educacao;
	}

	public Gestor getGestor() {
		return gestor;
	}

	public void setGestor(Gestor gestor) {
		this.gestor = gestor;
	}

	public Posiccao getPosicao() {
		return posicao;
	}

	public void setPosicao(Posiccao posicao) {
		this.posicao = posicao;
	}

	public Programaa getPrograma() {
		return programa;
	}

	public void setPrograma(Programaa programa) {
		this.programa = programa;
	}

	public Supervisor getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public AppUser getAppUser() {
		return appUser;
	}

	public void setAppUser(AppUser appUser) {
		this.appUser = appUser;
	}

	public Profissional getProfissional() {
		return profissional;
	}

	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
	}

}
