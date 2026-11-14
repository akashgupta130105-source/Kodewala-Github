package com.Instagram;

public class Main8 {
	public static void main(String []args) {
		String s1 = "Java";
		String s2 ="Java";
		String s3 = new String("Java");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
//	    output 1= true
//		output 2= false
//		output 3= true
//		because it store at same address
//		because s3 store in heap memory but other side s1 store in scp
//		4 Object
	}

}
