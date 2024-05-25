package com.johnifegwu.LSP;

import com.johnifegwu.LSP.MediumFactory.FacebookMedium;
import com.johnifegwu.LSP.interfaces.IPostMediaManager;
import com.johnifegwu.LSP.interfaces.ISocialMedia;
import com.johnifegwu.LSP.interfaces.IVideoCallManager;

public class FacebookSocialMediaService implements ISocialMedia, IVideoCallManager, IPostMediaManager {

    private FacebookMedium facebookMedium = null;

    public FacebookSocialMediaService() {
        this.facebookMedium = new FacebookMedium();
    }

    @Override
    public void publishPost(String address, String message) {
        this.facebookMedium.publishPost(address, message);
    }

    @Override
    public void privateChat(String address, String message) {
        this.facebookMedium.privateChat(address, message);
    }

    @Override
    public void groupChat(String address, String message) {
        this.facebookMedium.groupChat(address, message);
    }

    @Override
    public void sendPhotoAndVideo(String address, Object item) {
        this.facebookMedium.sendPhotoAndVideo(address, item);
    }

    @Override
    public void privateVideoCall(String address, Object message) {
        this.facebookMedium.privateVideoCall(address, message);
    }

    @Override
    public void groupVideoCall(String address, Object message) {
        this.facebookMedium.groupVideoCall(address, message);
    }
}
