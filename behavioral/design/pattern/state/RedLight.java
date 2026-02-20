package behavioral.design.pattern.state;

public class RedLight implements TrafficLightState{
    String colour = "Red";
    @Override
    public TrafficLightState next() {
        System.out.println("Changing the state from red to green.");
        return new GreenLight();
    }

    @Override
    public String getColour() {
        return colour;
    }
}
