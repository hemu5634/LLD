package structural.design.pattern.facade;

public class MediaPlayerFacade {
    private Command command;
    public MediaPlayerFacade(Command command){
        this.command=command;
    }
    public void setCommand(Command command){
        this.command=command;
    }
    public void performAction(){
        command.execute();
    }
}
