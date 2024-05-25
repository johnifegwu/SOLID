package com.johnifegwu.LSP;

import com.johnifegwu.LSP.MediumFactory.WhatsAppMedium;
import com.johnifegwu.LSP.interfaces.ISocialMedia;
import com.johnifegwu.LSP.interfaces.IVideoCallManager;

public class WhatsAppSocialMediaService implements ISocialMedia, IVideoCallManager {

    private WhatsAppMedium whatsAppMedium = null;

    public WhatsAppSocialMediaService(){
        this.whatsAppMedium = new WhatsAppMedium();
    }

    @Override
    public void privateChat(String address, String message) {
        this.whatsAppMedium.privateChat(address, message);
    }

    @Override
    public void groupChat(String address, String message) {
        this.whatsAppMedium.groupChat(address, message);
    }

    @Override
    public void sendPhotoAndVideo(String address, Object item) {
        this.whatsAppMedium.sendPhotoAndVideo(address, item);
    }

    @Override
    public void privateVideoCall(String address, Object message) {
        this.whatsAppMedium.privateVideoCall(address, message);
    }

    @Override
    public void groupVideoCall(String address, Object message) {
        this.whatsAppMedium.groupVideoCall(address, message);
    }
}
