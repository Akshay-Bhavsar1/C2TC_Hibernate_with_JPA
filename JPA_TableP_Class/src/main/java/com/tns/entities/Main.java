package com.tns.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_TableP_Class");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//Creating an employee
		Employee employee = new Employee();
		
		employee.seteName("Akshay");
		employee.seteSalay(40000);
		
		em.persist(employee);
		
		
		//Creating an Manager
		Manager manager = new Manager();
		
		manager.seteName("Dhananjay");
		manager.seteSalay(60000);
		manager.setDepartmentName("HR");
		
		em.persist(manager);
		
		em.getTransaction().commit();
		
		System.out.println("Employee and Manager entry's are added to the database");
		
		em.close();
		factory.close();

	}

}
