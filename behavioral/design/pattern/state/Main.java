package behavioral.design.pattern.state;

public class Main {
    public static void main(String[] args) {
        TrafficContext context = new TrafficContext();
        context.next();
        context.next();
        context.next();
        context.next();
    }
}
