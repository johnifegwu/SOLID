package com.johnifegwu.LSP;

import com.johnifegwu.LSP.MediumFactory.InstagramMedium;
import com.johnifegwu.LSP.interfaces.IPostMediaManager;
import com.johnifegwu.LSP.interfaces.ISocialMedia;

public class InstagramSocialMediaService implements ISocialMedia, IPostMediaManager {

    private InstagramMedium instagramMedium = null;

    public InstagramSocialMediaService(){
        this.instagramMedium = new InstagramMedium();
    }

    @Override
    public void privateChat(String address, String message) {
        this.instagramMedium.privateChat(address, message);
    }

    @Override
    public void groupChat(String address, String message) {
        this.instagramMedium.groupChat(address, message);
    }

    @Override
    public void sendPhotoAndVideo(String address, Object item) {
        this.instagramMedium.sendPhotoAndVideo(address, item);
    }

    @Override
    public void publishPost(String address, String message) {
        this.instagramMedium.publishPost(address, message);
    }
}
