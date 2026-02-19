package behavioral.design.pattern.observer;

public class Main {
    public static void main(String[] args) {
        Notification email = new EmailNotification();
        Notification sms = new SmsNotification();
        Notification push = new PushNotification();

        YouTubeImpl channel = new YouTubeImpl();
        channel.addSubscriber(email);
        channel.addSubscriber(sms);
        channel.uploadVideo("new LLD video");
        channel.removeSubscriber(sms);
        channel.addSubscriber(push);
        channel.uploadVideo("new HLD course");
    }
}
