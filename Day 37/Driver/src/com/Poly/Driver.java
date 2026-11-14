package com.Poly;

public class Driver {
	
		 public static void main(String []args) {
			 
//			 Deliver deliver = new Deliver();
//			 compile time -->it will check the method in deliver class
//			deliver.delivery//compile time-->
//			 parent class can refer 
			 Deliver del = new Ekart();
			 del.delivery();
			 
			 Deliver del1 = new ExpressBee();
			 ExpressBee express=(ExpressBee)del1;
			 express.delivery();
		 }
		 
		 

}
