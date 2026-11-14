package com.functioal;

public class Geeks {
	public static void main(String []args) {
		Thread thread = new Thread(()-> 
		System.out.println("New thread created"));
		thread.start();
	}

}
