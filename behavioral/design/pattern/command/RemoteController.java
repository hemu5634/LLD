package behavioral.design.pattern.command;

public class RemoteController {
    private Command turnOn;
    private Command turnOff;
    private Command changeVolume;
    private Command changeChannel;

    public void setTurnOn(Command turnOn) {
        this.turnOn = turnOn;
    }

    public void setTurnOff(Command turnOff) {
        this.turnOff = turnOff;
    }

    public void setChangeVolume(Command changeVolume) {
        this.changeVolume = changeVolume;
    }

    public void setChangeChannel(Command changeChannel) {
        this.changeChannel = changeChannel;
    }

    public void pressOn(){
        turnOn.execute();
    }

    public void pressOff(){
        turnOff.execute();
    }

    public void changeChannel(){
        changeChannel.execute();
    }

    public void changeVolume(){
        changeVolume.execute();
    }
}
