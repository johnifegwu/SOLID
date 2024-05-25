package com.johnifegwu.OCP.NotificationFactory;

import com.johnifegwu.OCP.MediumFactory.*;

public class NotificationFactory {

    private static NotificationFactory _instance = null;

    public static NotificationFactory Instance(){
        if (_instance == null) {
            _instance = new NotificationFactory();
        }
        return _instance;
    }

    public INotificationMedium Create(MediumTypes type) {
        return MediumFactory.Instance().Create(type);
    }
}
