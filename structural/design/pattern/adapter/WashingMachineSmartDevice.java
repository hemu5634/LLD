package structural.design.pattern.adapter;

public class WashingMachineSmartDevice implements SmartDevice{
    private WashingMachine washingMachine;
    private Adapter adapter;

    public WashingMachineSmartDevice(WashingMachine washingMachine, Adapter adapter) {
        this.washingMachine = washingMachine;
        this.adapter = adapter;
    }

    @Override
    public void turnOn() {
        washingMachine.connect(adapter);
        washingMachine.startWashing();
    }

    @Override
    public void turnOff() {
        washingMachine.stopWashing();
        washingMachine.disconnect(adapter);
    }
}
