package creational.design.pattern.factory;

public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    @Override
    public void size() {
        System.out.println("Car size is medium");
    }
}