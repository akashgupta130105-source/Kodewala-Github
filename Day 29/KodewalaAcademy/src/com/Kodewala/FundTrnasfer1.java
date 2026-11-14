package com.Kodewala;

public class FundTrnasfer1 {
	private String accountHolderName;
	private String accountNumber;
	private int balance;
	private String name;
	public FundTrnasfer1(String accountHolderName, String accountNumber, int balance, String name) {
		super();
		this.setAccountHolderName(accountHolderName);
		this.setAccountNumber(accountNumber);
		this.setBalance(balance);
		this.setName(name);
	}
	public FundTrnasfer1() {
		// TODO Auto-generated constructor stub
	}
	
	public void txnFund(int _amount) {
		balance = balance- _amount;
		if(_amount<0 ) {
		System.out.println("It's pirnt amount is negative it is not possible");
		}
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
