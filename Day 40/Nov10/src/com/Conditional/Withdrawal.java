package com.Conditional;

import java.util.Scanner;

public class Withdrawal {
	public static int main(String []args) {
		int balance= 50000;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a balance amount");
	int amount= sc.nextInt();
	
	
	if(amount>25000) {
		System.out.println("Daily Withdrawl limti is excced");
	}
	
	
     sc.close();
     return balance=balance-amount;
     
	}

}
