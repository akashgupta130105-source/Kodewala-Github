package com.amazon;

public class  NotificationServices{
	public void  sendNotifcation(String _type) {
		System.out.println("NotificationServices.sendNotifcation()");
		if(_type.equalsIgnoreCase("SMS"))
		{
			sendSMS();
				
		}else if (_type.equalsIgnoreCase("email"))
		
		{sendEmail();
		}
		else
		{
			sendWhatsApp();
		}
		
		
	}

	private void sendWhatsApp() {
		System.out.println("NotificationService.sendWhatsApp() START");
		System.out.println("NotificationService.sendWhatsApp() END");
		
	}

	private void sendEmail() {
		System.out.println("NotificcationServices.sendEmail() START");
		System.out.println("NotificcationServices.sendEmail() END");
	}

	private void sendSMS() {
		System.out.println("NotificcationServices.sendSMS() START");
		System.out.println("NotificcationServices.sendSMS() END");
		
	}
	}


