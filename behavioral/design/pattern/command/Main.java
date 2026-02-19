package behavioral.design.pattern.command;

public class Main {
    public static void main(String[] args) {
        Tv tv = new Tv();
        Command turnOn = new TurnOnCommand(tv);
        Command turnOff = new TurnOffCommand(tv);
        Command quickAcess = new QuickAccessCommand(tv);
        Command changeVolume = new ChangeVolumeCommand(tv,100);
        Command changeChannel = new ChangeChannelCommand(tv,452);

        RemoteController remoteController = new RemoteController();
        remoteController.setTurnOn(turnOn);
        remoteController.setTurnOff(turnOff);
        remoteController.setChangeChannel(changeChannel);
        remoteController.setChangeVolume(changeVolume);

        remoteController.pressOn();
        remoteController.changeChannel();
        remoteController.changeVolume();
        remoteController.pressOff();

        System.out.println();
        quickAcess.execute();

    }
}
