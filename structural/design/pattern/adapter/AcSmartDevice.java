package structural.design.pattern.adapter;

public class AcSmartDevice implements SmartDevice{
    private AirConditioner airConditioner;
    private Adapter adapter;
    public AcSmartDevice(AirConditioner airConditioner,Adapter adapter){
        this.airConditioner=airConditioner;
        this.adapter = adapter;
    }
    @Override
    public void turnOn() {
        airConditioner.connect(adapter);
        airConditioner.startCooling();
    }

    @Override
    public void turnOff() {
        airConditioner.stopCooling();
        airConditioner.disconnect(adapter);
    }
}
