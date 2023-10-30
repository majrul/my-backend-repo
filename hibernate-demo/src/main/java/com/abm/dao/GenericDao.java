package com.abm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.abm.entity.Employee;

public class GenericDao {

	public void save(Object obj) {
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("rupranswahajokisayo");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		//merge is a 2 in 1 method, can be used for insert as well as update
		em.merge(obj);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
	
	public Object fetchById(Class clazz, int id) {
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("rupranswahajokisayo");
		EntityManager em = emf.createEntityManager();

		//find generates select query
		Object obj = em.find(clazz, id);
		
		em.close();
		emf.close();
		
		return obj;
	}
}








