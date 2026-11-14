package com.Tcs;

public class User {
	
	String username;
	String userId;
	String mobileNumber;
	
	
	
	static
	{
		System.out.println("I am ins static init block");
	}
	
	public User(String username, String userId, String mobileNumber) {
		super();
		System.out.println("User.User(String username, String userId, String mobileNumber)..Constructur");
		this.username = username;
		this.userId = userId;
		this.mobileNumber = mobileNumber;
	}

	
	
	
	

}
