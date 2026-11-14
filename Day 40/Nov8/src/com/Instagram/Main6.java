package com.Instagram;

public class Main6 {
	public static void main(String []args)
	{
		String s1="Java";
		String s2 ="Ja"+"va";
		String s3= new String ("Java");
		String s4 = s3.intern();
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s2==s4);
		/*
		 * output 1= true
		 * output 2= false
		 * output 3= true
		 * output 4= true
		 */
	}
}
