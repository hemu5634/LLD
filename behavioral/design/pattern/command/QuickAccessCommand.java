package behavioral.design.pattern.command;

public class QuickAccessCommand implements Command{
    private Tv tv;
    private int channel;
    private int volume;
    public QuickAccessCommand(Tv tv){
        this.tv=tv;
        this.channel = 123;
        this.volume = 50;
    }
    @Override
    public void execute(){
        tv.turnOn();
        tv.setVolume(volume);
        tv.changeChannel(channel);
    }
}
