package behavioral.design.pattern.command;

public class ChangeChannelCommand implements Command {
    private Tv tv;
    private int channel;

    public ChangeChannelCommand(Tv tv,int channel){
        this.channel = channel;
        this.tv = tv;
    }
    @Override
    public void execute(){
        tv.changeChannel(channel);
    }
}
