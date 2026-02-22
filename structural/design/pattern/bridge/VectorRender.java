package structural.design.pattern.bridge;

public class VectorRender implements Render{
    @Override
    public void renderCircle(double radius) {
        System.out.println("Vector Render : Rendering the circle with radius "+ radius);
    }

    @Override
    public void renderRectangle(double height, double width) {
        System.out.println("Vector Render : Rendering the rectangle with height " + height + " width" + width);
    }
}
