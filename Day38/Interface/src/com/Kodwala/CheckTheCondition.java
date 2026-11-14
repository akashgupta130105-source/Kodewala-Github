package com.Kodwala;

public class CheckTheCondition {
	public static void main(String []args) {
		ILogin iLogin= new NameValidatiion();
		boolean result=iLogin.validateName("Akash");
		System.out.println(result);
		
	}

}
