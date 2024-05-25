package com.johnifegwu.OCP;

public interface INotificationService {

    public void sendOTP(String address, String message);

    public void sendTransactionReport(String address, String report);

}
