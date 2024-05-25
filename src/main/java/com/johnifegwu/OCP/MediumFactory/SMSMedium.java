package com.johnifegwu.OCP.MediumFactory;

public class SMSMedium implements INotificationMedium{

    public SMSMedium(){
        //Initialize API here.
    }

    @Override
    public void sendNotification(Object message, String address) {
        //Print message sent.
        System.out.println("SMS message sent to " + address + " using twillio API.");
    }

}
