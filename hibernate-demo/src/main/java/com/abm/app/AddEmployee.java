package com.abm.app;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.abm.entity.Employee;

public class AddEmployee {

	public static void main(String[] args) {
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("rupranswahajokisayo");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Employee emp = new Employee();
		emp.setName("Rutuja");
		emp.setSalary(25000);
		emp.setDateOfJoining(LocalDate.of(2023, 6, 10)); //set this on your own
		
		em.persist(emp); //persist will generate insert query
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}






