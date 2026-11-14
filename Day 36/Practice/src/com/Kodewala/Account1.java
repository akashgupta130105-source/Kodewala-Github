package com.Kodewala;

public class Account1 {
	private String name;
	 private String number;
	public Account1(String name, String number) {
		super();
		this.name = name;
		this.number = number;
	}
	
	public void viewAccount() {
		System.out.println(name);
		System.out.println(number);
	}

}
