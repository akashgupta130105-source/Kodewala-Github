package com.kodewala;

class User
{
	User()
	{
		
	}

	public User(String string) {
		// TODO Auto-generated constructor stub
	}
}



public class Driver1 {
	public static void main(String []args) {
		String city1 ="Banglore";//one object is created-->abc123
		String city2 ="Banglore";//use the existing -->abc123
		String city3 ="Banglore";//use the existing -->abc123
		String city4 ="Banglore";//use the existing -->abc123
		String city5 ="Banglore";//use the existing -->abc123
		System.out.println(city1 ==city2);
		
		System.out.println(city1.equals(city2));
		User user1 = new User("Kodewala");
		User user2 = new User("Kodewala");
		System.out.println(user1.equals(user2));
		
	}

}
