package com.Bank;

public class Main {
	public static void main(String []args) {
		BankAccount bankAccount=new BankAccount(5000,"Akash345");
		bankAccount.withdraw(6000);
		System.out.println(bankAccount.getBalance());
	}

}
