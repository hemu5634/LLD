package structural.design.pattern.facade;

public class MusicPlayerCommand implements Command {
    private MusicPlayer musicPlayer;
    public MusicPlayerCommand(){
        musicPlayer = new MusicPlayer();
    }
    @Override
    public void execute() {
        musicPlayer.intializeAudioDrivers();
        musicPlayer.decodeAudio();
        musicPlayer.startPlay();
    }
}
