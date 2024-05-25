package com.johnifegwu.OCP;

import com.johnifegwu.OCP.MediumFactory.INotificationMedium;
import com.johnifegwu.OCP.MediumFactory.MediumTypes;
import com.johnifegwu.OCP.NotificationFactory.NotificationFactory;

public class WhatsAppNotificationService implements INotificationService{

    INotificationMedium medium = null;

    public WhatsAppNotificationService() {
        this.medium = NotificationFactory.Instance().Create(MediumTypes.WHATSAPP);
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
