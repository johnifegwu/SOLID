package com.johnifegwu.OCP.MediumFactory;

public class EmailMedium implements INotificationMedium{

    public EmailMedium() {
        //Initialize API here.
    }

    @Override
    public void sendNotification(Object message, String address) {
        //Print message sent.
        System.out.println("Email message sent to " + address + " using JavaMailSenderAPI.");
    }

}
