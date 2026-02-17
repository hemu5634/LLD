package creational.design.pattern.factory;

public class VehicleFactory{

    public static Vehicle getVehicle(String vehicle){
        if(vehicle.equals("Car"))
            return new Car();
        else if(vehicle.equals("Bike"))
            return new Bike();
        else if(vehicle.equals("Truck"))
            return new Truck();
    }
}