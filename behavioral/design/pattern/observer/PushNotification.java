package behavioral.design.pattern.observer;

public class PushNotification implements Notification{
    @Override
    public void notification(String notification) {
        System.out.println("Notification via push notification " + notification);
    }
}
