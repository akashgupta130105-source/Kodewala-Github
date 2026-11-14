package com.amazon;

public class MainNotification {
	public static void main(String[] args) {
	
		NotificationServices notificationService = new NotificationServices();
	notificationService.sendNotifcation("SMS");
	notificationService.sendNotifcation("email");
	notificationService.sendNotifcation("other");

	
	
		
}
}

