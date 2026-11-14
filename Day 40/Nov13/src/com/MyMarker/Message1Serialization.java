package com.MyMarker;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Message1Serialization {
	public void serializeMessage1(Message1 message1) throws IOException {
		FileOutputStream fio = new FileOutputStream("message1.ser");
		ObjectOutputStream oos = new ObjectOutputStream	(fio);
		oos.writeObject(message1);
		oos.close();// close the connection
	}
}
