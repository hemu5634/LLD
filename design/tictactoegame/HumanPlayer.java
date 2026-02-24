package design.tictactoegame;

import java.util.Scanner;

public class HumanPlayer{
    static Scanner scanner = new Scanner(System.in);
    public static int[] makeMove() {
        System.out.println("Enter the row ");
        int row = scanner.nextInt();
        System.out.println("Enter the column ");
        int col = scanner.nextInt();
        return new int[]{row,col};
    }
}
