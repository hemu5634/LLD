package structural.design.pattern.facade;

public class VideoPlayerCommand implements Command{
    private VideoPlayer videoPlayer = new VideoPlayer();
    @Override
    public void execute() {
        videoPlayer.setupRenderingEngine();
        videoPlayer.loadFile();
        videoPlayer.playVideo();
    }
}
