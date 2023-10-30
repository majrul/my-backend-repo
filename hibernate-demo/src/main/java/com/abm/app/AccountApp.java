package com.abm.app;

import com.abm.entity.Account;
import com.abm.service.AccountService;

public class AccountApp {

	public static void main(String[] args) {
		AccountService accountService = new AccountService();
		
		/*Account account = new Account();
		account.setName("Majrul");
		account.setType("Savings");
		account.setBranch("Andheri");
		account.setBalance(5000);
		
		accountService.openAccount(account);
		System.out.println("Account opened successfully!");*/
		
		accountService.withdraw(6, 1000);
	}
}








