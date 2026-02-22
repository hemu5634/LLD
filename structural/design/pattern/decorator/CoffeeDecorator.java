package structural.design.pattern.decorator;

abstract class CoffeeDecorator implements Coffee{
    protected Coffee coffee;

    protected CoffeeDecorator(Coffee coffee){
        this.coffee=coffee;
    }
}
