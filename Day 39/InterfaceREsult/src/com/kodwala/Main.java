package com.kodwala;

public class Main {
	public static void  main(String []args) {
		IBooking iBooking = new TrainBooking();
		iBooking.autoUpgrade();
		
	}

}
