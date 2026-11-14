class OrderMgmt
{
	
public int orderValue = 1200;
public void placeOrder(String itemName)
{
	OrderMgmt objMgmt = new OrderMgmt();
System.out.println("Order value is:"+ objMgmt.orderValue);
System.out.println("Placing an order for:"+ itemName);
}
}