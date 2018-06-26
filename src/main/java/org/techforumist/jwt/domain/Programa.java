package org.techforumist.jwt.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Programa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -635693594694372791L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String pdod;
	private String p1;
	private String pcdc;
	private String p2;

	private String pmcp;
	private String p3;

	private String pmozal;
	private String p4;

	private String paids;
	private String p5;

	private String ptip;
	private String p6;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPdod() {
		return pdod;
	}

	public void setPdod(String pdod) {
		this.pdod = pdod;
	}

	public String getP1() {
		return p1;
	}

	public void setP1(String p1) {
		this.p1 = p1;
	}

	public String getPcdc() {
		return pcdc;
	}

	public void setPcdc(String pcdc) {
		this.pcdc = pcdc;
	}

	public String getP2() {
		return p2;
	}

	public void setP2(String p2) {
		this.p2 = p2;
	}

	public String getPmcp() {
		return pmcp;
	}

	public void setPmcp(String pmcp) {
		this.pmcp = pmcp;
	}

	public String getP3() {
		return p3;
	}

	public void setP3(String p3) {
		this.p3 = p3;
	}

	public String getPmozal() {
		return pmozal;
	}

	public void setPmozal(String pmozal) {
		this.pmozal = pmozal;
	}

	public String getP4() {
		return p4;
	}

	public void setP4(String p4) {
		this.p4 = p4;
	}

	public String getPaids() {
		return paids;
	}

	public void setPaids(String paids) {
		this.paids = paids;
	}

	public String getP5() {
		return p5;
	}

	public void setP5(String p5) {
		this.p5 = p5;
	}

	public String getPtip() {
		return ptip;
	}

	public void setPtip(String ptip) {
		this.ptip = ptip;
	}

	public String getP6() {
		return p6;
	}

	public void setP6(String p6) {
		this.p6 = p6;
	}

}
