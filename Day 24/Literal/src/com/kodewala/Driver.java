//There are two way to create a String.
//using literal 
//by using new keywords.
package com.kodewala;

public class Driver {
	public static void main(String []args) {
		String firstName = "Kodewala";//Object created in SCP -->firstName's address-->xyz321
		
		String lastName = "Kodewala";//Object with content "Kodewala" already created
		//and lastName will refer to existing object.
		//lastName is also pointing to address xyz321
		
		//String city = new String("Banglore");
		System.out.println(firstName == lastName);//== will compare the address  of an object.
	}

}
