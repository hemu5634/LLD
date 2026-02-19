package behavioral.design.pattern.command;

public class Tv {
    public void turnOn(){
        System.out.println("Turning on the TV.");
    }

    public void turnOff(){
        System.out.println("Turning the TV Off.");
    }

    public void changeChannel(int channel){
        System.out.println("Changing the Channel to " + channel);
    }

    public void setVolume(int volume){
        System.out.println("Changing the Volume to " + volume);
    }
}
