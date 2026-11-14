package com.Kodewala;

public class FundAmount {
	public static void main(String [] args) {
		Account acc = new Account("987654321",10000);
		acc.getAccountNumber();
		acc.withdraw(1000);
		acc.deposit(9000);
		
		System.out.println(acc.getAccountNumber());
		System.out.println(acc.getBalance());
		
	}

}
