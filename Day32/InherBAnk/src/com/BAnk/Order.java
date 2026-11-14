package com.BAnk;

public class Order {
	public boolean onlineOrder(String item, double price, String storeName) {
		validateOrdeItem(item);
		validatePrice(price);
		validateStroreName(storeName);
		validateDeliveryType();
		return true;
		
	}

	private boolean validateDeliveryType() {
		System.out.println("Order.validateDeliveryType()");
		return true;
		
	}

	private boolean validateStroreName(String storeName) {
		System.out.println("Order.validateStroreName()");
		return true;
		
	}

	private boolean validatePrice(double price) {
		System.out.println("Order.validatePrice()");
		return true;
		
	}

	private boolean validateOrdeItem(String item) {
		System.out.println("Order.validateOrdeItem()");
		return true;
		
		
	}

}
