package com.Kodewala;

public class TrainTicket implements IStaticMethod {

	@Override
	public void book() {
		System.out.println("TrainTicket.book()");
		
	}

	@Override
	public void cancelBooking() {
		System.out.println("TrainTicket.cancelBooking()");
		
	}

	@Override
	public void checkStatus() {
		connecttoDb();
		System.out.println("TrainTicket.checkStatus()");
		
	}
	public void autoUpgrade() {
		
		System.out.println("IStaticMethod.autoUpgrade()");
	}
	
	
	

	public static void printTicket(String path,String contents) {
		System.out.println("Printing ticket... static method"+path+" , "+contents);
	}
	private void connecttoDb() {
		System.out.println("TrainTicket.connecttoDb()");
	}
	
	
	
	

}
