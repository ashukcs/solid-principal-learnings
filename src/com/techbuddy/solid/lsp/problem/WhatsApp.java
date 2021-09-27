package com.techbuddy.solid.lsp.problem;

//WhatsApp class isn't substitutable with SocialMedia
public class WhatsApp extends SocialMedia{
    @Override
    public void chatWithFriend() {
        //login go here
    }

    @Override
    public void publishPost(Object post) {
        //not applicable
    }

    @Override
    public void sendPhotosAndVideos() {
        //logic go here
    }

    @Override
    public void groupVideoCall(String... users) {
        //logic go here
    }
}
