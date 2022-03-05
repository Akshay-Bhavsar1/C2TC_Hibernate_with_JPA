package com.tsn.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		
		//create one employee
		Employee employee = new Employee();
		employee.setName("Akshay");
		employee.setSalary(5000);
		em.persist(employee);
		
		//create one manager
		Manager manager = new Manager();
		manager.setName("Akshay_B");
		manager.setSalary(10000);
		manager.setDepartmentName("HR");
		em.persist(manager);
		
		em.getTransaction().commit();
		
		System.out.println("Added one Employee and Manager to Database");
		em.close();
		//factory.close();

	}

}
