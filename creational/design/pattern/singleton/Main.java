package creational.design.pattern.singleton;

public class Main {
    public static void main(String[] args) {
        Logger log = Logger.getInstance();
        log.log("log");
    }
}