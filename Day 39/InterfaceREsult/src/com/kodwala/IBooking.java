package com.kodwala;

/**
 * in 2010 - MMT
 */

public interface IBooking {
	void book();
	void cancelBooking();
	void checkStatus();
//	optional -- 2010
	
	
	public default void autoUpgrade() //to some of the classes
	{
		System.out.println("IBooking.autoUpgrade().....");
	}

}
