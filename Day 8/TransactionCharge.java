//3%Transaction if your transaction amount is more than 2000;
class TransactionCharge{
	public static void main(String args[]){
		int paymentValue = 2000;
		int paymentAmount = Integer.parseInt(args[0]);
	 String message = paymentValue < paymentAmount?"3% Charge applicable" :"Not Charge Applicable";
	 System.out.println(message);
	}
}