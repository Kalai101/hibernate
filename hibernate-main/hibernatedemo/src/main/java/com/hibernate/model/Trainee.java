package com.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRAINEE_DETAILS")
public class Trainee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EMPID")
	private int empid;
	@Column(name = "NAME")
	private String empname;
	@Column(name = "MOBILENUMBER")
	private String empphno;
	@Column(name = "EMAILID")
	private String empemail;
	
	
	
	public Trainee() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Trainee(int empid, String empname, String empphno, String empemail) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empphno = empphno;
		this.empemail = empemail;
	}



	public int getEmpid() {
		return empid;
	}



	public void setEmpid(int empid) {
		this.empid = empid;
	}



	public String getEmpname() {
		return empname;
	}



	public void setEmpname(String empname) {
		this.empname = empname;
	}



	public String getEmpphno() {
		return empphno;
	}



	public void setEmpphno(String empphno) {
		this.empphno = empphno;
	}



	public String getEmpemail() {
		return empemail;
	}



	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}
	
	
	
	
}
