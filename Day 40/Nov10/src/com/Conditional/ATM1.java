package com.Conditional;

public class ATM1 {
	double balance;
	
	public ATM1(double balance) {
		super();
		this.balance = balance;
		
	}
    public double withdraw(double amount) {
    	if(balance<amount) {
    		System.out.println("Insufficient balance");
    		
    	}
    	else {
    		System.out.println("Withdraw successful");
    	}
    	
    	return balance=balance-amount;
    }
    }

