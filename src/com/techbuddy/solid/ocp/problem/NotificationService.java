package com.techbuddy.solid.ocp.problem;

// As you can understand with class, which will always open for modification
// and this is violation of the Open Closed principal
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
