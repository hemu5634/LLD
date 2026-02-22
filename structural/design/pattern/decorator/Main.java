package structural.design.pattern.decorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Espresso();
        coffee = new SugarDecorator(coffee);
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());
    }
}
