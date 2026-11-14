package com.Park;

public class Bike implements Parking{
	public Bike(int parkingSlot) {
		super();
		this.parkingSlot = parkingSlot;
	}




	private int parkingSlot;
	public int getParkingSlot() {
		return parkingSlot;
	}

	public void setParkingSlot(int parkingSlot) {
		if(parkingSlot<=0) {
			throw new IllegalArgumentException("ParkingSlot is not available");
		}
		this.parkingSlot = parkingSlot;
	}
	
	
	

	@Override
	public int parkingFee(int hours) {
		
		
		
		return 0;
	}



	



	
	
}
