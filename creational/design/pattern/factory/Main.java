package creational.design.pattern.factory;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        Vehicle car = VehicleFactory.getVehicle("Car");
        Vehicle bike = VehicleFactory.getVehicle("Bike");
        Vehicle truck = VehicleFactory.getVehicle("Truck");
        display(car);
        display(bike);
        display(truck);
    }

    public static void display(Vehicle vehicle){
        vehicle.start();
        vehicle.size();
        vehicle.stop();
    }
}