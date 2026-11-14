package com.Bank;

public class BankAccount {
	private int balance;
	String userId;
	
	int amount;
	




	public BankAccount(int balance,String userId) {
		super();
		this.balance = balance;
		this.userId= userId;
		
	}
	
	
	public int getBalance() {
		return balance;
	}
	 
	
	
	
	public int  deposit(int amount) {
		
		if(amount<=0) {
			 throw new IllegalArgumentException("amount is never be negative" );
		}
		return balance= balance+amount;
	}
	public int withdraw(int amount) {
		if(amount<=0) {
			 throw new IllegalArgumentException("amount is never be negative" );
		}
		
		 if(balance < amount) {
			 throw new IllegalArgumentException("Withdraw amount is not greater than the balance");
		}
		
		return balance= balance-amount;
		
	}
	

}
