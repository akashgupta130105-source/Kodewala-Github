//Zepto get free delivery if ordr value is more then 500.
class ZeptoOrderCondition{
	public static void main(String args[]){
		int minOrderValue = 500;
		int orderPrice = Integer.parseInt(args[0]);
		System.out.println("Condition 1:" +(minOrderValue<orderPrice));
		String message = minOrderValue<orderPrice? "Free Delivery" : "Delivery charge required";
		System.out.println(message);

	}
}