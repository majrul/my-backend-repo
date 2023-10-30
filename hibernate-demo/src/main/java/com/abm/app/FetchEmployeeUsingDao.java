package com.abm.app;

import com.abm.dao.EmployeeDao;
import com.abm.entity.Employee;

public class FetchEmployeeUsingDao {

	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDao();
		Employee emp = dao.fetch(1);
		
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		System.out.println(emp.getDateOfJoining());
		
	}
}






