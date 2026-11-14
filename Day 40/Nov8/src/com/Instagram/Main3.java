package com.Instagram;

public class Main3 {
	public static void main(String []args) {
		String s1="Java";
		String s2="Ja"+"va";
		
		String s3 ="Ja";
		String s4=s3+"va";
		System.out.println(s1==s2);
//		Its return true because s2 resolve during compile time so its store in scp so s1 and s2 both have object have same address
		System.out.println(s1==s4);
//		It's return false because s1 and s4 Object have different memory address s4 store in heap memory but s1 store in a scp memory
		System.out.println(s1.equals(s4));
//		It's return ture because the contain of s1 and s4 is the same 
	}

}
