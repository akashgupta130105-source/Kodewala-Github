package Statement;

import java.util.Scanner;

public class Ecom{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DiscountCalculator calculator = new DiscountCalculator();

    System.out.println("Enter customer type (Gold/Silver/Regular): ");
    String customerType = scanner.nextLine();

    System.out.print("Enter purchase amount: ");
    double purchaseAmount = scanner.nextDouble();

    
        double discount = calculator.calculateDiscount(customerType, purchaseAmount);
        System.out.println("Discount: " + discount);
        System.out.println("Final amount to pay: " + (purchaseAmount - discount));
        scanner.close();
}
   
    

}


		
		
			
			
		
	
