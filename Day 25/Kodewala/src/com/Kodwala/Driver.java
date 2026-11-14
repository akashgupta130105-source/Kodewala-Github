package com.Kodwala;

public class Driver {
	public static void main(String[] args) {
		String s1 = "Kodewala";
		String s2 = new String("Academyf");// one is store in scp and same content is store in heap.
		String s3 = new String("Kodewala");// one is store in scp and same content is store in heap.//in the form of
											// original.
		String s4 = new String("Kodewala");
		System.out.println(s1 == s2);
		System.out.println(s4 == s3);// It's output is false because of same content but different address .
		System.out.println(s4.equals(s3));// It's output is true because of same content.
	}

}
