package com.MyMarker;

public class Message1 implements Serialization{
	
	
 public Message1(String messageId, String message) {
	 
		super();
		this.messageId = messageId;
		this.message = message;
	}
 private String messageId;
 private String message;
 public String getMessageId() {
	return messageId;
 }
 public void setMessageId(String messageId) {
	this.messageId = messageId;
 }
 public String getMessage() {
	return message;
 }
 public void setMessage(String message) {
	this.message = message;
 }
}
