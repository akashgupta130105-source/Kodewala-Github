package com.Instagram;

public class Main7 {
	public static void main(String []args) {
		String s1= "Java";
		String s2=s1;
		s1=s1.concat("Developer");
		System.out.println(s1);
		System.out.println(s2);
//	    output 1= Java Developer
//		output 2 = Java;
//		s2 does not change because it already compile
//		concat creat a new object
	}

}
