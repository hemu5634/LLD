package behavioral.design.pattern.command;

public class ChangeVolumeCommand implements Command{
    private Tv tv;
    private int volume;

    public ChangeVolumeCommand(Tv tv,int volume){
        this.tv = tv;
        this.volume = volume;
    }
    @Override
    public void execute(){
        tv.setVolume(volume);
    }
}
