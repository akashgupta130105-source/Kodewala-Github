package com.Kodewala;

public class BankAccount {
	
	public BankAccount(double balance) {
		if(balance<0) {
			throw new IllegalArgumentException("balance never be negative");
		}
		
		this.balance = balance;
	}
     
	private double balance;
	public double withdraw(double amount){
		
		 if(amount<=0) {
			 throw new IllegalArgumentException("amoutn is never be negative");	
		}
		 else if(balance <amount) {
				throw new IllegalArgumentException("Withdraw amount never be begger than balance");
			}
		balance-=amount;
		return balance; 
					
	}
	
	public double getBalance() {
		
		return balance;
	}
	public double deposit(double amount){
		 if(amount<=0) {
			 throw new IllegalArgumentException("amoutn is never be negative");
			
		}
		 balance+=amount;
		return balance;
	}	
}

	
	