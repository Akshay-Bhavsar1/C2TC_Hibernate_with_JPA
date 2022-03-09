package com.tns.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="Retired_Emp")
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
