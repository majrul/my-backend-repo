package com.abm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.abm.entity.Address;
import com.abm.entity.Customer;

public class CustomerAddressDao {

	public void add(Customer customer) {
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("rupranswahajokisayo");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		em.persist(customer); //persist will generate insert query
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
	
	public void update(Customer customer) {
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("rupranswahajokisayo");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		em.merge(customer); //merge will generate update query
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
	
	public void add(Address address) {
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("rupranswahajokisayo");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		em.persist(address); //persist will generate insert query
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
