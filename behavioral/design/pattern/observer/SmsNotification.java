package behavioral.design.pattern.observer;

public class SmsNotification implements Notification{
    @Override
    public void notification(String notification) {
        System.out.println("Notification via sms notification " + notification);
    }
}
