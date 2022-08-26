package com.samco.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENTDB")
public class Student {
	@Id
	@Column
	private int ID;
	@Column
	private String NAME;
	@Column
	private String DEPT;
	@Column
	private String YR;
	
	public Student() {
		super();
	}

	public Student(int iD, String nAME, String dEPT, String yR) {
		super();
		ID = iD;
		NAME = nAME;
		DEPT = dEPT;
		YR = yR;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getDEPT() {
		return DEPT;
	}

	public void setDEPT(String dEPT) {
		DEPT = dEPT;
	}

	public String getYR() {
		return YR;
	}

	public void setYR(String yR) {
		YR = yR;
	}

}
