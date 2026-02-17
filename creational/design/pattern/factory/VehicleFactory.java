package creational.design.pattern.factory;

public class VehicleFactory{

    public static Vehicle getVehicle(String vehicle){
        switch (vehicle) {
            case "Car":
                return new Car();
            case "Bike":
                return new Bike();
            case "Truck":
                return new Truck();
            default:
                throw new IllegalArgumentException("Unknown Argument Exception");
        }
    }
}