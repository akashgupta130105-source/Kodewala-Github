package com.Codew;

public class Main2 {
	public static void main(String []args) {
		UserData user= new UserData("Akash","84684");
		DataDeletion dataDeletion=new DataDeletion();
		dataDeletion.delete(user);
		
	}

}
