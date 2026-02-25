package design.tictactoegame;


public class TicTacToeBoard implements BoardGames {
    private static final String PLAYER_TO_MOVE = "\nPlayer %s to move%n";
    private static final String WINNER_MESSAGE = "\nPlayer %s Won%n";
    private static final String DRAW_MESSAGE = "\nThe Match is Draw%n";

    private final Board board;
    private final Player playerX;
    private final Player playerO;
    private Player currentPlayer;
    private boolean gameOver;

    public TicTacToeBoard(int rows, int column, PlayerStratergy playerXStrategy, PlayerStratergy playerOStrategy) {
        this.board = new Board(rows, column);
        this.playerX = new Player(Symbol.X, playerXStrategy);
        this.playerO = new Player(Symbol.O, playerOStrategy);
        this.currentPlayer = playerX;
        this.gameOver = false;
    }

    @Override
    public void play() {
        while (!gameOver) {
            board.printBoard();
            System.out.printf(PLAYER_TO_MOVE, currentPlayer.getSymbol());

            Position move = currentPlayer.getStrategy().makeMove(board);
            board.makeMove(move, currentPlayer.getSymbol());

            if (board.checkWinner(currentPlayer.getSymbol())) {
                announceWinner();
            } else if (board.checkDraw()) {
                announceDraw();
            }

            switchPlayer();
        }
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == playerX) ? playerO : playerX;
    }

    private void announceWinner() {
        System.out.printf(WINNER_MESSAGE, currentPlayer.getSymbol());
        board.printBoard();
        gameOver = true;
    }

    private void announceDraw() {
        System.out.printf(DRAW_MESSAGE);
        board.printBoard();
        gameOver = true;
    }
}
