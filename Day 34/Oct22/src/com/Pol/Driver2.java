package com.Pol;

public class Driver2 {
	public static void main(String [] args) {
	 
			User us = new AdminUSer();
			System.out.println(us);//this is called upType casting
		    AdminUSer us1 = (AdminUSer)new User();
		    //this is called downTypecasting
		    System.out.println(us1);
			
			
		
}

}
