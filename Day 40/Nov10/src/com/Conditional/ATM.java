package com.Conditional;

import java.util.Scanner;

public class ATM {
	public static void  main(String []args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter account balance: ");
		int balance=sc.nextInt();
		
		System.out.println("Enter withdrawal amount");
		int amount=sc.nextInt();
		
		if(amount<500) {
			System.out.println("Minimum withdraw amount is less than 500");
		}
		else if(balance<amount) {
			System.out.println("Insufficient balance");
		}
		else {
			System.out.println("Withdrawal Seccessful");
			
			System.out.println("Remaining balance: "+ (balance-amount));
		}
		
		
	}
	

}
