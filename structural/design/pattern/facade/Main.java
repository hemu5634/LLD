package structural.design.pattern.facade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Multimedia App!");
        System.out.println("Choose an action: playMusic, playVideo, viewImage");
        String action = scanner.nextLine();
        Command command = CommandFactory.getCommand(action);
        MediaPlayerFacade facade = new MediaPlayerFacade(command);
        facade.performAction();
    }
}
