package com.Conditional;

import java.util.Scanner;

public class ATMPIn {
	public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a 4-digit pin");
    int fourdigitPin=sc.nextInt();
    if(fourdigitPin==1234) {
    	System.out.println("Login Successful");
    }
    else {
    	System.out.println("Incorrect Pin");
    }
    

}
	}
