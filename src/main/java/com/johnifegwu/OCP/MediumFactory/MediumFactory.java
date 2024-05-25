package com.johnifegwu.OCP.MediumFactory;

public class MediumFactory implements IMediumFactory{

    private static MediumFactory _instance = null;

    public static MediumFactory Instance(){
        if (_instance == null) {
            _instance = new MediumFactory();
        }
        return _instance;
    }
    @Override
    public INotificationMedium Create(MediumTypes type) {
        return switch (type) {
            case EMAIL -> new EmailMedium();
            case SMS -> new SMSMedium();
            case WHATSAPP -> new WhatsAppMedium();
        };
    }
}
