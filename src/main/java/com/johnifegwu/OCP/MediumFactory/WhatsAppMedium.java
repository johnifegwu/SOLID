package com.johnifegwu.OCP.MediumFactory;

public class WhatsAppMedium implements INotificationMedium{

    public WhatsAppMedium() {
        //Initialize API here.
    }

    @Override
    public void sendNotification(Object message, String address) {
      //Print message sent.
        System.out.println("WhatsApp message sent to " + address + " using WhatsApp API.");
    }

}
