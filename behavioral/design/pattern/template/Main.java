package behavioral.design.pattern.template;

public class Main {
    public static void main(String[] args) {
        Recipe biryani  = new Biryani();
        Recipe paneer = new KadhaiPaneer();
        biryani.prepare();
        paneer.prepare();
    }
}
