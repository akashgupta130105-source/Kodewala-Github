package com.Park;

public class Truck implements Parking{
	public Truck(int parkingSlot) {
		super();
		this.parkingSlot = parkingSlot;
	}

	private int parkingSlot;

	@Override
	public int parkingFee(int amount) {
		if(amount== 100) {
			System.out.println("Parking amount pay successfully");
		}

		else {
			System.out.println("Please give Rs100");
		}
		
		return 0;
	}

	public int getParkingSlot() {
		return parkingSlot;
	}

	public void setParkingSlot(int parkingSlot) {
		if(parkingSlot<=0) {
			throw new IllegalArgumentException("ParkingSlot is not available");
		}
		this.parkingSlot = parkingSlot;
	}

}
