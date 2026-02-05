package demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class EmailNotificationService implements NotificationService {
    @Override
    public void send() {
        System.out.println("This is an Email");
    }
}
