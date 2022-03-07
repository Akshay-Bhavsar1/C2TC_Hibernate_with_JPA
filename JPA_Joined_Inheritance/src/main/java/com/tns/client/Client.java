package com.tns.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tns.entities.ActiveEmployee;
import com.tns.entities.RetiredEmployee;

public class Client {

	public static void main(String[] args) {


		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_Joined_Inheritance");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		ActiveEmployee ae = new ActiveEmployee();
		
		RetiredEmployee re = new RetiredEmployee();
		
		ae.seteId(102);
		ae.seteName("Akshay_B");
		ae.seteSalary(50000);
		ae.seteExperience(3);
		em.persist(ae);
		
		re.seteId(103);
		re.seteName("Nitin_S");
		re.setePension(5000);
		em.persist(re);
		
		em.getTransaction().commit();
	}

}
