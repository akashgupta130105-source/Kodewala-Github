package com.Notes;

public class Driver {
	public static void main(String []args) {
		String s1 ="This "+ " is from "+ "Kodewala Academy Bangalore";
		//string s1 = "This is from Kodewala Academy Bnaglore";
		String s2 =new String("This is from Kodewala Academy Bangalore");
		System.out.println(s1.equals(s2));
		System.out.println(s1);
		String s3 = "Kodewala";//scp
		String s4 = "Acadmey";//scp
		String s5 = s3+s4;//Heap --> new StringBuilder
		System.out.println(s5);
		String s6 ="KodewalaAcadmey";//Scp
		System.out.println(s6==s5.intern());//false
	}

}
