package com.Codew;

public class MainClean {
	public static void main(String []args) {
		User user =new User("KW1234","Kodewala");
		DataCleaner cleaneer= new DataCleaner();
		cleaneer.clean(user);
	}

}
