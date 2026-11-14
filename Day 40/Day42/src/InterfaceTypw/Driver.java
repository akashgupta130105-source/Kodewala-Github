package InterfaceTypw;

public class Driver {
      public static void main(String []args) throws CloneNotSupportedException{
    	  Account acc = new Account("Kodewala Academy","BTM Banglore", "987654");
    	  
    	    Account CloneObjectOfAcc =(Account)acc.clone(); // trying to clone
    	    System.out.println(CloneObjectOfAcc.accNo);
    	    
    	   
    	   
    	  if(acc instanceof Cloneable) {
    		  System.out.println("true...allowed to perform the activity...");
    	  }
    	  else {
    		  System.out.println("false");
    	  }
      }
}
