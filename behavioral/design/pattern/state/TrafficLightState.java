package behavioral.design.pattern.state;

public interface TrafficLightState {
    TrafficLightState next();
    String getColour();
}
