package com.jsp.person.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("gauri");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		//create person object
		
		Person person=new Person();
		person.setName("xyz");
		person.setEmail("xyz@mail.com");
		person.setCno(984125639l);
		
		
		//pan object
		
		Pan pan=new Pan();
		pan.setAddress("mumbai");
		
		
		//setting pan with specified person
		pan.setPerson(person);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();
		
	
			
				
	}

}
