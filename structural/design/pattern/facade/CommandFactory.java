package structural.design.pattern.facade;

public class CommandFactory {
    public static Command getCommand(String action){
        switch (action.toLowerCase()){
            case "playmusic" :
                return new MusicPlayerCommand();
            case "playvideo" :
                return new VideoPlayerCommand();
            case "viewimage" :
                return new ImageViewerCommand();
            default :
                return null;
        }
    }
}
