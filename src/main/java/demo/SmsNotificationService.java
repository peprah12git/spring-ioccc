package demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("sms")
public class SmsNotificationService implements NotificationService {

    @Override
    public void send() {
        System.out.println("Sending SMS");
    }
}
