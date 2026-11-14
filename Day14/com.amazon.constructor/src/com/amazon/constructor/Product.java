package com.amazon.constructor;

public class Product {
	
		String productName;
		int price;
		String description;
		int quantity;
		
		public Product() {
			// TODO Auto-generated constructor stub
		}

		public Product(String productName, int price, String description, int quantity) {
			this.productName = productName;
			this.price = price;
			this.description = description;
			this.quantity = quantity;
		}

		public Product(String productName, int price, String description) {
			this.productName = productName;
			this.price = price;
			this.description = description;
		}
		
		
		

}
