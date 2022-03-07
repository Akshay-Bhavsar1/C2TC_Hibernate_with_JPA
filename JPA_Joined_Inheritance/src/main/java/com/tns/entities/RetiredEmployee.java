package com.tns.entities;

import javax.persistence.Entity;

@Entity
public class RetiredEmployee extends Employee
{

	private int ePension;

	public int getePension() {
		return ePension;
	}

	public void setePension(int ePension) {
		this.ePension = ePension;
	}
	
	
}
