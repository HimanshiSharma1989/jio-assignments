package com.reliance.jio.assignments.assignment5;

import java.util.concurrent.atomic.AtomicLong;

public enum EnumParam {
	ICICI,
	HDFC,
	SBI;
	
	private String bank_name;
	private String branch;
	private int branch_code;
	private AtomicLong no_of_accounts;
	
//	
	public void setValues(String bank_name, String branch, int branch_code,AtomicLong no_of_accounts) {
		setBank_name(bank_name);
		setBranch(branch);
		setBranch_code(branch_code);
		setNo_of_accounts(no_of_accounts);
	}
	
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getBranch_code() {
		return branch_code;
	}
	public void setBranch_code(int branch_code) {
		this.branch_code = branch_code;
	}
	public AtomicLong getNo_of_accounts() {
		return no_of_accounts;
	}
	public void setNo_of_accounts(AtomicLong no_of_accounts) {
		this.no_of_accounts = no_of_accounts;
	}
	
	
}
