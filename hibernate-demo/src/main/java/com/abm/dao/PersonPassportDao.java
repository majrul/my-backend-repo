package com.abm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.abm.entity.Passport;
import com.abm.entity.Person;

public class PersonPassportDao {

	public void add(Person person) {
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("rupranswahajokisayo");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		em.persist(person); //persist will generate insert query
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
	
	public void add(Passport passport) {
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("rupranswahajokisayo");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		em.persist(passport); //persist will generate insert query
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
	
	public Person fetchPersonById(int id) {
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("rupranswahajokisayo");
		EntityManager em = emf.createEntityManager();

		//find generates select query
		Person p = em.find(Person.class, id);
		
		em.close();
		emf.close();
		
		return p;
	}

	public Passport fetchPassportById(int id) {
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("rupranswahajokisayo");
		EntityManager em = emf.createEntityManager();

		//find generates select query
		Passport p = em.find(Passport.class, id);
		
		em.close();
		emf.close();
		
		return p;
	}
	
	public List<Passport> fetchAllPassports() {
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("rupranswahajokisayo");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select p from Passport p"); //HQL/JPQL
		List<Passport> list = q.getResultList();
		
		em.close();
		emf.close();
		
		return list;
	}
	
	public List<Passport> fetchPassportsIssuedBy(String issuedBy) {
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("rupranswahajokisayo");
		EntityManager em = emf.createEntityManager();

		Query q = 
			em.createQuery("select p from Passport p where p.issuedBy = :ib");
		q.setParameter("ib", issuedBy);
		List<Passport> list = q.getResultList();
		
		em.close();
		emf.close();
		
		return list;
	}
	
	public List<Passport> fetchPassportsIssuedIn(int year) {
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("rupranswahajokisayo");
		EntityManager em = emf.createEntityManager();

		Query q = 
			em.createQuery("select p from Passport p where year(p.issueDate) = :yr");
		q.setParameter("yr", year);
		List<Passport> list = q.getResultList();
		
		em.close();
		emf.close();
		
		return list;
	}
	
	
	
	
	
	
	
	
	
}





