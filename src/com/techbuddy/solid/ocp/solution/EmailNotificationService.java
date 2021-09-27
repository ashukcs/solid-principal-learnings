package com.techbuddy.solid.ocp.solution;

// Here you can see this class implements base interface, provide the implementation related to email.
public class EmailNotificationService implements NotificationService {
    public long sendNotification(String medium){
        // do job to send notification on emails.
        return 0;
    }
}
