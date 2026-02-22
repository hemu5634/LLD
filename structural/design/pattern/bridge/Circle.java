package structural.design.pattern.bridge;

public class Circle extends Shape{
    private double radius;
    public Circle(Render render,double radius){
        super(render);
        this.radius=radius;
    }
    @Override
    void draw() {
        render.renderCircle(radius);
    }
}
