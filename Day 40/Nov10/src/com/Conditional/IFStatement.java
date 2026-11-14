package com.Conditional;

import java.util.Scanner;

public class IFStatement {
     public static void main(String []args) {
    	 Scanner sc= new Scanner(System.in);
    	 System.out.println("Enter a amount");
    	 int amount=sc.nextInt();
    	 if(amount<=0) {
    		 System.out.println("Invalid withdrawal amount ");
    	 }
    	 sc.close();
    	 
     }
}
