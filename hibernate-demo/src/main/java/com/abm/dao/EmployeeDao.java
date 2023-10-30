package com.abm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.abm.entity.Employee;

public class EmployeeDao {

	public void add(Employee emp) {
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("rupranswahajokisayo");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		em.persist(emp); //persist will generate insert query
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
	
	public Employee fetch(int empno) {
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("rupranswahajokisayo");
		EntityManager em = emf.createEntityManager();

		//find generates select query
		Employee emp = em.find(Employee.class, empno);
		
		em.close();
		emf.close();
		
		return emp;
	}
}





















