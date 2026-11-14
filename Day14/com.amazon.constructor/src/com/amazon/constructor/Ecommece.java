package com.amazon.constructor;

public class Ecommece {
	public static void main(String []args) {
		
		
		
		Product user1 = new Product("Mobile",1000,"This is the best at this price");
		System.out.println(user1.productName +" and "+ user1.price +" and "+user1.description+" This is default constructor");
		Product user2 = new Product("Bottle", 900, "Millton Bottle");
		System.out.println(user2.productName+" and "+user2.price+" and "+user2.description);
		Product user3 = new Product("Laptop", 45000, "In Sale", 1);
	    System.out.println(user3.productName+" and " +user3.price+" and "+user3.description+" and "+user3.quantity);
		
		
		
		
	}
	
}