package com.abm.app;

import java.time.LocalDate;

import com.abm.dao.CustomerAddressDao;
import com.abm.entity.Address;
import com.abm.entity.Customer;

public class CustomerAddressApp {

	public static void main(String[] args) {
		CustomerAddressDao dao = new CustomerAddressDao();
		
		//scenario: adding customer
		/*Customer c = new Customer();
		c.setName("Harshad");
		c.setEmail("harshad@gmail.com");
		c.setDateOfBirth(LocalDate.of(2000, 10, 10));
		dao.add(c);*/
		
		//scenario: adding address
		/*Address a = new Address();
		a.setCity("Mumbai");
		a.setState("Maharashtra");
		a.setPincode(400050);
		dao.add(a);*/
		
		//scenario: 
		// add customer first, then address
		// and then link customer and address
		/*Customer c = new Customer();
		c.setName("John");
		c.setEmail("john@gmail.com");
		c.setDateOfBirth(LocalDate.of(2001, 10, 10));
		dao.add(c);
		
		Address a = new Address();
		a.setCity("Pune");
		a.setState("Maharashtra");
		a.setPincode(411050);
		dao.add(a);
		
		c.setAddress(a);
		dao.update(c);*/
		
		//scenario: 
		// add customer and address together
		Customer c = new Customer();
		c.setName("Anjali");
		c.setEmail("anjali.com");
		c.setDateOfBirth(LocalDate.of(2021, 10, 10));
		
		Address a = new Address();
		a.setCity("Latur");
		a.setState("Maharashtra");
		a.setPincode(413512);
		
		c.setAddress(a);
		
		dao.add(c);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
