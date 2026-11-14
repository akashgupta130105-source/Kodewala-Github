package com.Pracice;

public class Driver {
     public static void main(String []args) {
    	 IAccount account=(name,add,amt)->
    	 {
    		System.out.println("Open Account... for" +name +" " + add +" "+ amt);
    		return "Account Opened";
    		
    		
    	 };
    	 String result = account.openAccount("Akash","BTM Banglore" ,50000);
     }
}
