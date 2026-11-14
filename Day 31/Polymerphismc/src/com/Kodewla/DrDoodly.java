package com.Kodewla;

public class DrDoodly {
	 public void performance(String name, int workingHour, double customerRating) {
		 System.out.println("DrDoodly.performance()");
		 System.out.println(name);
		 System.out.println(workingHour);
		 System.out.println(customerRating);
	 }

}

 class SeniorDr extends DrDoodly{
	public void performance(String name, int workingHour, double customerRating) {
		System.out.println("SeniorDr.performace()");
	}
}
 

