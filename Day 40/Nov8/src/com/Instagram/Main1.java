package com.Instagram;

public class Main1 {
	public static void main(String []args) {
		String s1 = "Hello";
		String s2 =new String("Hello");
		String s3 = s2.intern();
		
		System.out.println(s1==s2);
//		s1==s2 is return false because the address of the object is different .
		System.out.println(s1==s3);
//		s1 == s3 is return true because when we apply the intern so the address of the object become same 
		System.out.println(s2==s3);
//		s3==s2 is return false because the address of the object is different s2 direct heap but s3 direct scp.
	}

}
