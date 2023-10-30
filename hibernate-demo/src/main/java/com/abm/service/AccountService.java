package com.abm.service;

import java.time.LocalDateTime;
import java.util.List;

import com.abm.dao.GenericDao;
import com.abm.entity.Account;
import com.abm.entity.Transaction;
import com.abm.exception.BankAccountException;

public class AccountService {

	public void openAccount(Account account) {
		if(account.getBalance() >= 10000) {
			GenericDao dao = new GenericDao();
			dao.save(account);
			//send an email
		}
		else {
			//BankAccountException e = new BankAccountException("Not enough balance for opening account!");
			//throw e;
			throw new BankAccountException("Not enough money to open account!");
		}
	}
	
	public void withdraw(int acno, double amount) {
		GenericDao dao = new GenericDao();
		Account account = (Account) dao.fetchById(Account.class, acno);
		if(account.getBalance() >= amount) {
			account.setBalance(account.getBalance() - amount);
			dao.save(account);
			Transaction tx = new Transaction();
			tx.setDateAndTime(LocalDateTime.now());
			tx.setAmount(amount);
			tx.setType("WITHDRAW");
			tx.setAccount(account);
			dao.save(tx);
		}
		else
			throw new BankAccountException("Insufficient Balance!");
	}
	
	public void deposit(int acno, double amount) {
		GenericDao dao = new GenericDao();
		Account account = (Account) dao.fetchById(Account.class, acno);
		account.setBalance(account.getBalance() + amount);
		dao.save(account);
		Transaction tx = new Transaction();
		tx.setDateAndTime(LocalDateTime.now());
		tx.setAmount(amount);
		tx.setType("DEPOSIT");
		tx.setAccount(account);
		dao.save(tx);
	}
	
	public void transfer(int fromAcno, int toAcno, double amount) {
		withdraw(fromAcno, amount);
		deposit(toAcno, amount);
	}
	
	public double checkBalance(int acno) {
		return 0;
	}
	
	public List<Transaction> miniStatement(int acno) {
		return null;
	}
}
