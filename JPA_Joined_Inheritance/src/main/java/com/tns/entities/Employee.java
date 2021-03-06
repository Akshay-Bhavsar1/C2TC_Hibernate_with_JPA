package com.tns.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="employee_details")
@Inheritance(strategy=InheritanceType.JOINED)

@DiscriminatorColumn(name="emp_status", discriminatorType = DiscriminatorType.STRING)
public class Employee implements Serializable
{

	@Id
	private int eId;
	private String eName;
	
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	
	
}
