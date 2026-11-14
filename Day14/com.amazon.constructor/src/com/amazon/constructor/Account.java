package com.amazon.constructor;

public class Account {
	int amount;
	String name;
	Account(){
		System.out.println("inside account()");
		
	}
	Account(int _amount, String _name){
		System.out.println("intside Account(int _amount, String _name)");
		this.amount = _amount;
		this.name = _name;
	}
 
 }

