package structural.design.pattern.bridge;

abstract class Shape {
    protected Render render;

    public Shape(Render render){
        this.render=render;
    }

    abstract void draw();
}
