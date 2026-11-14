package com.Pol;

public class Driver7 {
	public static void main(String []args) {
		Account acc = new Account(2000);
		acc.withdraw(500);
		System.out.println(acc.getBalance());
	}

}
