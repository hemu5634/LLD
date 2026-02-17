package creational.design.pattern.factory;

public class Bike implements Vehicle{
    @Override
    public void start() {
        System.out.println("Bike is starting");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping");
    }

    @Override
    public void size() {
        System.out.println("Bike size is small");
    }
}