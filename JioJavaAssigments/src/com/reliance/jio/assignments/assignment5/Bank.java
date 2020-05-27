package com.reliance.jio.assignments.assignment5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class Bank {
	private String bank_name;
	private EnumParam enumParam;
	
	private List<Account> accounts = new ArrayList<Account>();
		
	public Bank(String bankName) {
		this.bank_name = bankName;
		EnumParam enumparam = EnumParam.valueOf(bankName);
		//Read from property here
		
		String branch = null;
		int branch_code = 0;
		AtomicLong no_of_accounts = null;
		
		branch = PropertiesCache.getInstance().getProperty(bankName+".branch");
		branch_code = Integer.parseInt(PropertiesCache.getInstance().getProperty(bankName+".branch_code"));
		no_of_accounts = new AtomicLong(Long.parseLong(PropertiesCache.getInstance().getProperty(bankName+".no_of_accounts")));
		
		
		enumparam.setValues(bank_name, branch, branch_code, no_of_accounts);
		this.enumParam = enumparam;
		System.out.println("BANK :::: "+ enumParam.getBank_name()+" | "+enumParam.getBranch()+" | "+enumParam.getBranch_code()+" | "+enumParam.getNo_of_accounts());
	}
	
	public void openAccount(String accountType) {
		Account account = new Account(accountType, this);
		accounts.add(account);
		System.out.println("AFTER OPENING THE ACCOUNT :::: "+ enumParam.getBank_name()+" | "+enumParam.getBranch()+" | "+enumParam.getBranch_code()+" | "+enumParam.getNo_of_accounts());
		
	}
	
	public void increaseNoOfAccounts() {
		AtomicLong noOfAccounts = enumParam.getNo_of_accounts();
		noOfAccounts.getAndIncrement();
		enumParam.setNo_of_accounts(noOfAccounts);
		
	}
	





	public static void main(String[] args) {
		
		
		Bank bank1 = new Bank("ICICI");
		bank1.openAccount("SAVINGS");
		
		Bank bank2 = new Bank("HDFC");
		bank2.openAccount("SAVINGS");
		
		Bank bank3 = new Bank("SBI");
		bank3.openAccount("CURRENT");
		
		/*
		 * for (EnumParam enumParam : EnumParam.values()) {
		 * System.out.println(enumParam);
		 * System.out.println(enumParam.getBank_name()+" | "+enumParam.getBranch()+" | "
		 * +enumParam.getBranch_code()+" | "+enumParam.getNo_of_accounts());
		 * System.out.println("********************************"); }
		 */
	}
}
