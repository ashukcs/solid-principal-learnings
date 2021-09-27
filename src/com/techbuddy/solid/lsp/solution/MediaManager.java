package com.techbuddy.solid.lsp.solution;

public interface MediaManager extends VideoConferencingManager{
    public void chatWithFriend();
    public void sendPhotosAndVideos();
    public void groupVideoCall(String... users);
}
