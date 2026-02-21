package structural.design.pattern.adapter;

public class WifiAdapter implements Adapter{
    private String name = "Wifi";
    @Override
    public String getName() {
        return name;
    }
}
