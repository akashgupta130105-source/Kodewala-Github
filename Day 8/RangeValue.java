// Write a program to check if a number is within a specific range(e.g 10to 50). 
class RangeValue{
	public static void main(String args[]){
		int  minValue = 10;
		int maxValue = 50;
		int userValue = Integer.parseInt(args[0]);
		System.out.println(minValue<userValue && maxValue>userValue);
		/*String message =minValue<userValue? "Inside the range" : "Out of the Range ";
		System.out.println(message);*/
	}
}