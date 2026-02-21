package structural.design.pattern.composite;

public class Main {
    public static void main(String[] args) {
        SmartComponent ac = new Ac();
        SmartComponent bulb = new Bulb();
        CompositeSmartComponent room1 = new CompositeSmartComponent("room1");
        CompositeSmartComponent room2 = new CompositeSmartComponent("room2");
        CompositeSmartComponent floor1 = new CompositeSmartComponent("floor1");
        CompositeSmartComponent floor2 = new CompositeSmartComponent("floor2");
        CompositeSmartComponent house = new CompositeSmartComponent("house");
        room1.addComponent(ac);
        room1.addComponent(bulb);
        room2.addComponent(ac);
        room2.addComponent(bulb);
        floor1.addComponent(room1);
        floor1.addComponent(room2);
        floor2.addComponent(room1);
        house.addComponent(floor1);
        house.addComponent(floor2);
        house.turnOn();
        house.turnOff();

    }
}
