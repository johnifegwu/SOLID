package com.johnifegwu.LSP.interfaces;

public interface IVideoCallManager {

    //supported by Facebook and WhatsApp
    public  void privateVideoCall(String address, Object message);

    //supported by Facebook and WhatsApp
    public  void groupVideoCall(String address, Object message);

}
