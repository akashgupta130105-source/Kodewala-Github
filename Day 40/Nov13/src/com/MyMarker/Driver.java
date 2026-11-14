package com.MyMarker;

import java.io.IOException;

public class Driver {
	public static void main(String[] args) throws IOException {
		
		Message1Serialization message1Serialization = new Message1Serialization();
		Message1 message1 = new Message1("MSG1","Kya kar rahe bahi");
		
		message1Serialization.serializeMessage1(message1);
	}

}
