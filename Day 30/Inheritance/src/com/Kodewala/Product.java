package com.Kodewala;

public class Product {
	String productName;
	String desciption;
	int quantity;
	String status;
	public Product(String productName, String desciption, int quantity, String status) {
		super();
		this.productName = productName;
		this.desciption = desciption;
		this.quantity = quantity;
		this.status = status;
	}

	public void viewProductDetails() {
		System.out.println(productName);
		System.out.println(desciption);
		System.out.println(quantity);
		System.out.println(status);
		
	}
	

}
