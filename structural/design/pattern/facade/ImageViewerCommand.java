package structural.design.pattern.facade;

public class ImageViewerCommand implements Command{
    private ImageViewer imageViewer = new ImageViewer();
    @Override
    public void execute() {
        imageViewer.loadImage();
        imageViewer.applyScaling();
        imageViewer.displayImage();
    }
}
