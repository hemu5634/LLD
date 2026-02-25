package design.tictactoegame;

public class Main {
    private static final int BOARD_SIZE = 3;

    public static void main(String[] args) {

         PlayerStratergy playerX = new HumanPlayerStratergy("player X");
         PlayerStratergy playerO = new ComputerPlayerStratergy("Computer O",BOARD_SIZE,BOARD_SIZE);

        BoardGames game = new TicTacToeBoard(BOARD_SIZE, BOARD_SIZE, playerX, playerO);
        game.play();
    }
}
