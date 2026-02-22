package structural.design.pattern.facade;

public class ImageViewer {
    public void loadImage(){
        System.out.println("Loading the image");
    }

    public void applyScaling(){
        System.out.println("Applying scaling");
    }

    public void displayImage(){
        System.out.println("DisplayImage");
    }
}
