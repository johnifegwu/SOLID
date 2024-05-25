package com.johnifegwu.LSP.MediumFactory;

import com.johnifegwu.LSP.interfaces.ISocialMedia;
import com.johnifegwu.LSP.interfaces.IVideoCallManager;

public class WhatsAppMedium implements ISocialMedia, IVideoCallManager {

    public WhatsAppMedium() {
        //Initialize API here.
    }

    @Override
    public void privateChat(String address, String message) {
        //Print message sent.
        System.out.println("Posted private message to " + address + " using WhatsApp API.");
    }

    @Override
    public void groupChat(String address, String message) {
        //Print message sent.
        System.out.println("Posted group message to " + address + " using WhatsApp API.");
    }

    @Override
    public void sendPhotoAndVideo(String address, Object item) {
        //Print message sent.
        System.out.println("Sent photo to " + address + " using WhatsApp API.");
    }

    @Override
    public void privateVideoCall(String address, Object message) {
        //Print message sent.
        System.out.println("Private video call started with " + address + " using WhatsApp API.");
    }

    @Override
    public void groupVideoCall(String address, Object message) {
        //Print message sent.
        System.out.println("Group video call started with " + address + " using WhatsApp API.");
    }
}
