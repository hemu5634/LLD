package structural.design.pattern.adapter;

public class BluetoothAdapter implements Adapter{
    private String name="Bluetooth";
    @Override
    public String getName() {
        return name;
    }
}
