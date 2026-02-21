package structural.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeSmartComponent implements SmartComponent{
    private List<SmartComponent> components = new ArrayList<>();
    private String name;
    public CompositeSmartComponent(String name){
        this.name=name;
    }
    public void addComponent(SmartComponent component){
        components.add(component);
    }

    public void removeComponent(SmartComponent component){
        components.remove(component);
    }

    @Override
    public void turnOn() {
        System.out.println("\nTurning on the Components for " + name);
        for(SmartComponent component:components)
            component.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("\nTurning off the Components for " + name);
        for (SmartComponent component : components)
            component.turnOff();
    }
}
