package com.Kodewala;

//what to do?

public interface IStaticMethod {
	public abstract void book();
	public abstract void cancelBooking();
	public abstract void checkStatus();
//	optional--200
	public default void autoUpgrade() {
		connecttoDb();
		System.out.println("IStaticMethod.autoUpgrade()");
	}
//	it's in java 8 version.
//	static method help prevent also from code duplicate
	public static void printTicket(String path,String contents) {
		System.out.println("Printing ticket... static methid");
	}
	
/*
 * we create a private a method in the interface in 9 or above of the method
 */
	private  void connecttoDb() {
		System.out.println("TrainTicket.connecttoDb()");
		
	}

}
