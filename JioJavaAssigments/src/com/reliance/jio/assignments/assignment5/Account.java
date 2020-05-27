package com.reliance.jio.assignments.assignment5;

public class Account {
	private int currentAccounts=20000;
	private int savingAccounts=30000;
	private Bank bank;
	
	public Account(String accountType, Bank bank) {
		this.bank = bank;
		if("SAVINGS".equalsIgnoreCase(accountType)) {
			incrementSavingAccounts();
		}else if("CURRENT".equalsIgnoreCase(accountType)) {
			incrementCurrentAccounts();
		}
		
		// TODO Auto-generated constructor stub
	}

	public void incrementCurrentAccounts() {
		currentAccounts++;
		bank.increaseNoOfAccounts();
	}
	
	public void incrementSavingAccounts() {
		savingAccounts++;
		bank.increaseNoOfAccounts();
	}
}
