package structural.design.pattern.bridge;

public class RasterRender implements Render{
    @Override
    public void renderCircle(double radius) {
        System.out.println("Raster Rander : Rendering the circle with radius " + radius);
    }

    @Override
    public void renderRectangle(double height, double width) {
        System.out.printf("Raster Rander : Rendering the rectangle with height %f and  width %f%n",height,width);
    }
}
