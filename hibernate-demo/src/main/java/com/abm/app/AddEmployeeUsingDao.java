package com.abm.app;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.abm.dao.EmployeeDao;
import com.abm.entity.Employee;

public class AddEmployeeUsingDao {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("Saurabh");
		emp.setSalary(25000);
		emp.setDateOfJoining(LocalDate.of(2023, 6, 10)); 
		
		EmployeeDao dao = new EmployeeDao();
		dao.add(emp);
		
	}
}






