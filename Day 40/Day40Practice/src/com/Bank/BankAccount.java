package com.Bank;

public class BankAccount {
	private double balance;
	
	private String accountNumber;
	
	public BankAccount(double balance, String accountNumber) {
		if(balance <0) {
throw new IllegalArgumentException("Initial balance cannot be negative ");
		}
		 if (accountNumber == null || accountNumber.isBlank()) {
	            throw new IllegalArgumentException(
	                "Account number cannot be empty"
	            );
	        }
		this.balance = balance;
		this.accountNumber= accountNumber;
	}
	public double getBalance() {
		return balance;
	}

	
	
	 public double deposite(double amount) {
		 if(amount<=0) {
			 throw new IllegalArgumentException("deposite cannot be negative");
			 
		 }
		 return balance = balance+amount;
	 }
	 public double withdraw(double amount) {
		 if(balance<amount) {
			 throw new IllegalArgumentException("Withdraw amount is not exced balance");
		 }
		 return balance = balance-amount;
	 }
	 public String getAccountNumber() {
		return accountNumber;
	 }
	 
	
		
	}


