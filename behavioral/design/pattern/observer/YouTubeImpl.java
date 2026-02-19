package behavioral.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeImpl implements YouTube{
    private List<Notification> notifications;
    private String video;
    public YouTubeImpl(){
        notifications = new ArrayList<>();
    }

    @Override
    public void addSubscriber(Notification subscriber) {
        notifications.add(subscriber);
    }

    @Override
    public void removeSubscriber(Notification subscriber) {
        notifications.remove(subscriber);
    }

    @Override
    public void notifySubscriber() {
        for(Notification notification : notifications){
            notification.notification(video);
        }
    }

    public void uploadVideo(String video){
        this.video = video;
        notifySubscriber();
    }
}
