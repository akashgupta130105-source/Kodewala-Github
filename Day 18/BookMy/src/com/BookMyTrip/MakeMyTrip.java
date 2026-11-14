package com.BookMyTrip;

public class MakeMyTrip {
	
	
    public int tripPlan(int amount)
    {
   	 if(amount < 5000)
   	 {
   		 System.out.println("No discount applied");
   	 }
   	 else if(amount >=5000 && amount < 10000 )
   	 {
   		 System.out.println("10% discount applied");
   	 }
   	 else if(amount >= 10000)
   	 {
   		 System.out.println("15% discount applied");
   	 }
   	 
   	 else
   	 {
   		 System.out.println("Maximum discount per customer is 1250 only");
   	 }
   	 
   	 return amount;
   	 
    }
}

}
