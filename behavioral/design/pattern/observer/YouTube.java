package behavioral.design.pattern.observer;

public interface YouTube {
    void addSubscriber(Notification subscriber);
    void removeSubscriber(Notification subscriber);
    void notifySubscriber();
}
