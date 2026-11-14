package com.Kodewala;

public class Driver  {
  public static void main(String []args) {
	  IAccount account= (String name,String address, int balance)->
	  {
		System.out.println("Driver.main()"+ name+" "+address+" "+balance);
		return"Account opened ";
	  };
	  account.openAccount("Akash","BtM",1000);
  }

  
  } 
	
	

//  @Override
//  public void accountDetails() {
//	// TODO Auto-generated method stub
//	
//  }

