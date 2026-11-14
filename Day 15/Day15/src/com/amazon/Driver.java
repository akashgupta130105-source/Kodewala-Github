package com.amazon;

public class Invoice{
	static int gst = 18;
	int amount;
	String itemName;
	String billingAddress;
	String customerId;
	String customerName;
	
	Invoice(int _amount,String _billingAddress, String  _customerId, String customerName)
	
	{
		this.amount =_amount;
		String _itemName;
		this.itemName =  _itemName;
		this.billingAddress = _billingAddress;
		this.customerId=_customerId;
		String _customerName;
		this.customerName = _customerName;
		
	}
	
	

}
public class Driver{
	public static void main(String[] args) {
	Invoice inv = new Invoice(18000,"Iphone18","667777","Kodewala" );
	Invoice inv1= new Invoice(500,"Oppo", "Kodwala","C0987");
	System.out.println(inv."first invoice;" +inv.amount+","+inv.customerId+","+Invoice.gst );
	System.out.println(inv1."first invoice;"+ inv1.amount+","+inv1.customerId+","+Invoice.gst );
	
	//f5 for inside
	//f6 go forword
	//f7 return step
	//f8 next break point
	}   
}
