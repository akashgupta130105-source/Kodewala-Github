package com.amazon.constructor;

public class Akash {
	Akash(){
		System.out.println("Default constructor called");
	}
	Akash(String name){
		System.out.println("Parameterized constructor called:" +name);
		
	}
	public static void main (String [] args) {
		Akash t1 = new Akash();
		Akash t2 = new Akash("Vikash");
	}
	
	

}
