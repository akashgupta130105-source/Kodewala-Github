package com.Kodewala;

public class MainAccount {
	public static void main(String []args) {
	BankAccount acc= new BankAccount(3000);
//	acc.withdraw();
	acc.deposit(400.0);
	System.out.println(acc.getBalance());
	
	}
	
	

}
