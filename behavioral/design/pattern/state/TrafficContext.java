package behavioral.design.pattern.state;

public class TrafficContext {
    private TrafficLightState state;

    public TrafficContext(){
        this.state = new RedLight();
    }

    public void next(){
        state=state.next();
    }

    public String getColour(){
        return state.getColour();
    }
}
