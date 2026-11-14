package com.Pol;

public class Account {
	private double balance;

	public Account(double balance) {
		if (balance < 0) {
		       throw new IllegalArgumentException("Initial balance cannot be negative.");
		   }
		this.balance = balance;
		
		
		
		
	}

	public double getBalance() {
		return balance;
	}
	
	
	

	
	public double deposit(double amount) {
		if(amount <=0) {
			throw new IllegalStateException("Deposit amount must be greater than zero.");
		}
		balance = balance +=amount;
		return balance;
		
		
		
	}
     public double withdraw(double amount) {
    	  if(amount<=0) { throw new IllegalStateException("amount is never be negative");
		 
    	 }
    	  else if(amount > balance) {
    		 throw new IllegalStateException("balance is less than withdraw amount");
    	 }
    	 
    	 balance = balance -=amount;
    	 return balance;
		 
		
	}

	 
     
	
	

}
