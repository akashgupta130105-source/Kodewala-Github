package com.Whatsapp;

import java.io.IOException;

public class Driver {
    public static void main(String[] args) throws IOException {
    	
    	MessageSerialization messageSerialization = new MessageSerialization();
    	Message message = new Message("133445","Kya kar rahi ho");
    	messageSerialization.serializeMsg(message);   
    }
}
