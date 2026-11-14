//Same day delivery if you are an Amazon prime user.
class SameDayDeliveryForPrime{
	public static void main(String args[]){
		int primeUser = 1;
		//int noramalUser = 2;
		int userPassword = Integer.parseInt(args[0]);
		String message = primeUser==userPassword? "Same day delivery" : "After 3 day delivery";
		System.out.println(message);
		/*String primeUser = args[0];
		String normalUser = args[1];*/
		/*String message = primeUser<normalUser? "Same day delivery" : "After 3 day delivery";
		System.out.println(message);*/
	}
}