package com.Instagram;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Driver {
	public static void main(String []args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("D:\\Java course\\Day 40\\Nov7\\message.ser");
	    ObjectInputStream ois = new ObjectInputStream(fis);
	    Message message= (Message)ois.readObject();
	    System.out.println("De ser : "+message.getMessage());
	
	}

}
