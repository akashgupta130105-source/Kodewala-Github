package com.Bank;

public class Main {
	public static void main(String []args) {
		BankAccount bankAccount=new BankAccount(100,"876543");
		
		System.out.println(bankAccount.getBalance());
	}

}
