package design.tictactoegame;

public class Main {
    public static void main(String[] args) {
        Board tic = new TicTacToeBoard(3,3,"human","human");
        tic.play();
    }
}
