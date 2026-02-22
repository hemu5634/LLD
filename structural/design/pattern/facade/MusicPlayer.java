package structural.design.pattern.facade;

public class MusicPlayer {
    public void intializeAudioDrivers(){
        System.out.println("Intializing Audio Drivers");
    }

    public void decodeAudio(){
        System.out.println("Decoding Audio");
    }
    public void startPlay(){
        System.out.println("Playing Audio");
    }
}
