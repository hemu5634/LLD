package behavioral.design.pattern.state;

public class GreenLight implements TrafficLightState{
    String colour = "Green";
    @Override
    public TrafficLightState next() {
        System.out.println("Changing the state from green to yellow");
        return new YellowLight();
    }

    @Override
    public String getColour() {
        return colour;
    }
}
