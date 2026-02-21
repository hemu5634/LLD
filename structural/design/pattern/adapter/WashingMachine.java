package structural.design.pattern.adapter;

public class WashingMachine {
    public void startWashing(){
        System.out.println("Washing Machine started washing");
    }
    public void stopWashing(){
        System.out.println("Washing Machine stopped washing");
    }
    public void connect(Adapter adapter){
        System.out.println("Washing Machine connected with " + adapter.getName());
    }
    public void disconnect(Adapter adapter){
        System.out.println("Washing Machine disconnect with " + adapter.getName());
    }
}
