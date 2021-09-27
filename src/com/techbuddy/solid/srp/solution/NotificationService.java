package com.techbuddy.solid.srp.solution;

// This Notification service will handle only notifications.
public class NotificationService {
    public long sendNotification(String medium){
        switch(medium) {
            case "email":
                //send notification to email
                return 0;
            case "mobile":
                //send notification to mobile
                return 0;
            default:
                //Perform default logic
                return 0;
        }
    }
}
