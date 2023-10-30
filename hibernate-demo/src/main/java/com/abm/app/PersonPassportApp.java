package com.abm.app;

import java.util.List;

import com.abm.dao.PersonPassportDao;
import com.abm.entity.Passport;

public class PersonPassportApp {

	public static void main(String[] args) {
		PersonPassportDao dao = new PersonPassportDao();
		
		//scenario: fetching person
		/*Person p = dao.fetchPersonById(1);
		System.out.println(p.getName());
		System.out.println(p.getEmail());
		System.out.println(p.getDateOfBirth());*/
		
		//List<Passport> passports = dao.fetchAllPassports();
		//List<Passport> passports = dao.fetchPassportsIssuedBy("Govt. of India");
		List<Passport> passports = dao.fetchPassportsIssuedIn(2020);
		for(Passport passport : passports) {
			System.out.println("ID " + passport.getId());
			System.out.println("Issue Date " + passport.getIssueDate());
			System.out.println("Validity (years) " + passport.getValidity());
			System.out.println("Issued By " + passport.getIssuedBy());
			System.out.println("====================");
		}
				
	}
}










