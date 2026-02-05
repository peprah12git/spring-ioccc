package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationManager {
    private final NotificationService notificationService;

    //---------using constructor dependency--------
    @Autowired
    public NotificationManager(@Qualifier("sms") NotificationService notificationService){
        this.notificationService = notificationService;
    }
    public  void sendNotification(){
        notificationService.send();
    }
}
