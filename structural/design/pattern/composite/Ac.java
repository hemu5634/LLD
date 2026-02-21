package structural.design.pattern.composite;

public class Ac implements SmartComponent{
    @Override
    public void turnOn() {
        System.out.println("Turn on the Ac");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off the Ac");
    }
}
