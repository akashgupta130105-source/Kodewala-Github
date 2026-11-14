package com.Instagram;

public class Main4 {
	public static void main(String []args) {
		String s1= "Java";
		String s2=s1;
		s1=s1.concat("Developer");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
//		output no 1 is Java
//		output no 2 is Java
//		output no 3 is Java Developer
//		
	}

}
