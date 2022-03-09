package com.tns.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="Active_Emp")
public class ActiveEmployee extends Employee
{

	private int eSalary;
	private int eExperience;
	
	
	public int geteSalary() {
		return eSalary;
	}
	public void seteSalary(int eSalary) {
		this.eSalary = eSalary;
	}
	public int geteExperience() {
		return eExperience;
	}
	public void seteExperience(int eExperience) {
		this.eExperience = eExperience;
	}
	
	
}
