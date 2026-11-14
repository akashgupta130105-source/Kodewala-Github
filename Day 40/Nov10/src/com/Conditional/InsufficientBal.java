package com.Conditional;

public class InsufficientBal {
	int balance;
	
	public InsufficientBal(int balance) {
		super();
		if(balance<=0) {
			System.out.println("Insufficient balance");
		}
		this.balance = balance;
	}
}






	


