package structural.design.pattern.bridge;

public class Main {
    public static void main(String[] args) {
        Render raster = new RasterRender();
        Render vector = new VectorRender();
        Shape rasterCircle = new Circle(raster,10);
        Shape vectorCircle = new Circle(vector,10);
        Shape rasterRectangle = new Rectangle(raster,10,2);
        Shape vectorRectangle = new Rectangle(vector,10,2);
        rasterCircle.draw();
        vectorCircle.draw();
        rasterRectangle.draw();
        vectorRectangle.draw();
    }
}
