package creational.design.pattern.builder;

public class Car {
    private int capacity;
    private String engine;
    private String colour;
    private boolean sunroof;
    private boolean navigation;

    private Car(CarBuilder builder){
        this.capacity = builder.capacity;
        this.colour = builder.colour;
        this.engine = builder.engine;
        this.sunroof = builder.sunroof;
        this.navigation = builder.navigation;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getEngine() {
        return engine;
    }

    public String getColour() {
        return colour;
    }

    public boolean isSunroof() {
        return sunroof;
    }

    public boolean isNavigation() {
        return navigation;
    }

    @Override
    public String toString() {
        return "Car{" +
                "capacity=" + capacity +
                ", engine='" + engine + '\'' +
                ", colour='" + colour + '\'' +
                ", sunroof=" + sunroof +
                ", navigation=" + navigation +
                '}';
    }

    public static class CarBuilder{
        private int capacity = 5;
        private String engine = "1.0L";
        private String colour = "Black";
        private boolean sunroof = false;
        private boolean navigation = false;

        public CarBuilder setCapacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setColour(String colour) {
            this.colour = colour;
            return this;
        }

        public CarBuilder setSunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        public CarBuilder setNavigation(boolean navigation) {
            this.navigation = navigation;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }
}
