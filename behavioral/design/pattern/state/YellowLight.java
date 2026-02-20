package behavioral.design.pattern.state;

public class YellowLight implements TrafficLightState{
    String colour = "yellow";
    @Override
    public TrafficLightState next() {
        System.out.println("Changing state from yellow to red.");
        return new RedLight();
    }

    @Override
    public String getColour() {
        return colour;
    }
}
