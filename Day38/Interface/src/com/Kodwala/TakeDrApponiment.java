package com.Kodwala;

public class TakeDrApponiment implements IDrDoodly {

	@Override
	public boolean checkDrPresent(int time) {
		if(time >=8 ) {
			System.out.println("Dr is  available");
		}
		else{
			System.out.println("Dr is not available");
		}
		return false;
	}

	@Override
	public boolean drWorkingOrNot() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
