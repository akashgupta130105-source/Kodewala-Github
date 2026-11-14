package com.Park;

public class Car implements Parking  {
	public Car(int parkingSlot) {
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
	public int parkingFee(int amount) {
		
			if(amount== 50) {
				System.out.println("Parking amount pay successfully");
			}

			else {
				System.out.println("Please give Rs50");
			}
		return 0;
	}

}
