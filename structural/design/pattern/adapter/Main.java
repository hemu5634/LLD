package structural.design.pattern.adapter;

public class Main {
    public static void main(String[] args) {
        Adapter wifi = new WifiAdapter();
        Adapter bluetooth = new BluetoothAdapter();
        SmartDevice ac = new AcSmartDevice(new AirConditioner(),wifi);
        SmartDevice washingMachine = new WashingMachineSmartDevice(new WashingMachine(),bluetooth);
        ac.turnOn();
        ac.turnOff();
        washingMachine.turnOn();
        washingMachine.turnOff();
    }
}
