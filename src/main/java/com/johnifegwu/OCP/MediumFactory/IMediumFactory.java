package com.johnifegwu.OCP.MediumFactory;

public interface IMediumFactory {

    public INotificationMedium Create(MediumTypes type);

}
