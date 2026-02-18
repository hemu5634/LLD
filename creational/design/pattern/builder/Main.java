package creational.design.pattern.builder;

public class Main {
    public static void main(String[] args){
        Car.CarBuilder builder = new Car.CarBuilder();
        Car car = builder.setCapacity(5)
                .setEngine("1.0L Turbo Petrol")
                .setSunroof(true)
                .build();
        System.out.println(car);
    }
}
