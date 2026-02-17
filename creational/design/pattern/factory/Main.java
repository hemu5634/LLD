package creational.design.pattern.factory;

public class Main {

    public static void main(String[] args){
        Vehicle vehicle = VehicleFactory.getVehicle("Car");
    }
}