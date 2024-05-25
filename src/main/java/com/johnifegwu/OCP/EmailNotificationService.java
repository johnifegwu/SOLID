package com.johnifegwu.OCP;

import com.johnifegwu.OCP.MediumFactory.INotificationMedium;
import com.johnifegwu.OCP.MediumFactory.MediumTypes;
import com.johnifegwu.OCP.NotificationFactory.NotificationFactory;

public class EmailNotificationService implements INotificationService{

    INotificationMedium medium = null;

    public EmailNotificationService(INotificationMedium medium) {
        this.medium = NotificationFactory.Instance().Create(MediumTypes.EMAIL);
    }

    @Override
    public void sendOTP(String address, String message) {
        this.medium.sendNotification(message, address);
    }

    @Override
    public void sendTransactionReport(String address, String report) {
        this.medium.sendNotification(report, address);
    }
}
