package structural.design.pattern.bridge;

public class Rectangle extends Shape{
    private double height,width;
    public Rectangle(Render render,double height,double width){
        super(render);
        this.height=height;
        this.width =width;
    }
    @Override
    void draw() {
        render.renderRectangle(height,width);
    }
}
