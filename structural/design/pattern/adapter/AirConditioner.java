package structural.design.pattern.adapter;

public class AirConditioner {
    public void startCooling(){
        System.out.println("Ac started cooling");
    }

    public void stopCooling(){
        System.out.println("Ac stopped cooling");
    }

    public void connect(Adapter adapter){
        System.out.println("Ac connected to " + adapter.getName());
    }

    public void disconnect(Adapter adapter){
        System.out.println("Ac disconnected to " + adapter.getName());
    }
}
