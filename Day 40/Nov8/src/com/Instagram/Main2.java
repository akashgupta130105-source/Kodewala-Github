package com.Instagram;

public class Main2 {
	public static void main(String []args) {
		String s1="Java";
		String s2="Java";
		s1.concat("Developer");
		System.out.println(s1);
//		s1= Java Developer
		System.out.println(s1 == s2);
//		false because both object address is different 
//		output1 = Java
//		outPut2 = Java Developer

	}

}
