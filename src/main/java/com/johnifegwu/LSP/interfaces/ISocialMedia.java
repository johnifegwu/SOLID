package com.johnifegwu.LSP.interfaces;

public interface ISocialMedia {

    //supported by Facebook, WhatsApp and Instagram
    public void privateChat(String address, String message);

    //supported by Facebook, WhatsApp and Instagram
    public void groupChat(String address, String message);

    //supported by Facebook, WhatsApp and Instagram
    public void sendPhotoAndVideo(String address, Object item);
}
