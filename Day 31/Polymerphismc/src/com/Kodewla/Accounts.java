package com.Kodewla;

public class Accounts {
	String accountNumber;
	String holderName;
	int balance;
	int _amount;
	
	public Accounts(String accountNumber, String holderName, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
		
	}
	public int balance() {
		
		return balance;
	}
	
	public void withdraw(int _amount) {
		
		
		 if( balance <= 1000 ) {
			 System.out.println("Withdraw option is not avialable");
		 }
			 
			 else {
				 balance = balance -=_amount;
				 System.out.println(balance);
				 
			 }
			 
		 }
	
	
	public void deposit(int _amount) {
		balance =balance += _amount;
	
	
	}
	
public void earnIterest(int _amount){
		
		if(_amount>1000) {
		   System.out.println("No entersest");
		}
	}
		
	
	

	
	
	
	

}
