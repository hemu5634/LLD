package creational.design.pattern.factory;

public class Truck implements Vehicle{
    @Override
    public void start() {
        System.out.println("Truck is starting");
    }

    @Override
    public void stop() {
        System.out.println("Truck is stopping");
    }

    @Override
    public void size() {
        System.out.println("Truck size is large");
    }
}