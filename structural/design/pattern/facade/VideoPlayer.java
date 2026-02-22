package structural.design.pattern.facade;

public class VideoPlayer {
    public void setupRenderingEngine(){
        System.out.println("Setting up the rendering engine");
    }

    public void loadFile(){
        System.out.println("loading the video file");
    }

    public void playVideo(){
        System.out.println("Playing Video");
    }
}
