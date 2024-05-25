package com.johnifegwu.LSP.MediumFactory;

import com.johnifegwu.LSP.interfaces.IPostMediaManager;
import com.johnifegwu.LSP.interfaces.ISocialMedia;

public class InstagramMedium implements ISocialMedia, IPostMediaManager {

    public InstagramMedium() {
        //Initialize API here.
    }

    @Override
    public void publishPost(String address, String message) {
        //Print message sent.
        System.out.println("Published post to " + address + " using Instagram API.");
    }

    @Override
    public void privateChat(String address, String message) {
        //Print message sent.
        System.out.println("Posted private message to " + address + " using Instagram API.");
    }

    @Override
    public void groupChat(String address, String message) {
        //Print message sent.
        System.out.println("Posted group message to " + address + " using Instagram API.");
    }

    @Override
    public void sendPhotoAndVideo(String address, Object item) {
        //Print message sent.
        System.out.println("Sent photo to " + address + " using Instagram API.");
    }
}
