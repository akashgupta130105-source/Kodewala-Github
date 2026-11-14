package com.Kodewala;

public class ElectronicProduct extends Product {
	
	boolean isWarranty;
	int warrtyInYear;
	
	
     public ElectronicProduct(String productName, String desciption, int quantity, String status, boolean isWarranty,
			int warrtyInYear) {
		super(productName, desciption, quantity, status);
		this.isWarranty = isWarranty;
		this.warrtyInYear = warrtyInYear;
	}


	 //	public ElectronicProduct(String productName, String desciption, int quantity, String status,boolean isWarranty,int warrtyInYear) {
//		
//		super(productName, desciption, quantity, status);
//		
//		this.isWarranty=isWarranty;
//		this.warrtyInYear=warrtyInYear;
//		
//	}
	
	public void viewElectronicProductDetails() {
		System.out.println(productName);
		System.out.println(desciption);
		System.out.println(quantity);
		System.out.println(status);
		System.out.println(isWarranty);
		System.out.println(warrtyInYear);
	}
	

	

	


}
