package behavioral.design.pattern.observer;

public class EmailNotification implements Notification{
    @Override
    public void notification(String notification) {
        System.out.println("Notification via email notification " + notification);
    }
}
