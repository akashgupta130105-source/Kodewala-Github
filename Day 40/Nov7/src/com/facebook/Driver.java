package com.facebook;

import java.io.IOException;

public class Driver {
	public static void main(String []args) throws IOException  {
		MessageSerilization messageSerilization = new MessageSerilization();
		Message message = new Message("MSG1", "Kya kar rahi ho");
		messageSerilization.serializetionMsg(message);
	    
		
	}

}
