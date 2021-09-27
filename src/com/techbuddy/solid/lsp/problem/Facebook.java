package com.techbuddy.solid.lsp.problem;

//Facebook class is substitutable with SocialMedia
public class Facebook extends SocialMedia{
    @Override
    public void chatWithFriend() {
        //logic go here
    }

    @Override
    public void publishPost(Object post) {
        //logic go here
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
