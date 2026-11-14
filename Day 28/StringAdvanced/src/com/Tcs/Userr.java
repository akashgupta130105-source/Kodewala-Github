package com.Tcs;

public class Userr {
	String userId;
	String userName;
	String type;
	
	public static int LiveUerrCount =1;
	
	
	public Userr(String userId, String userName, String type ) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.type=type;
	}


	public Userr(String userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
	{
		 LiveUerrCount =  LiveUerrCount +1;
	}
	

}
