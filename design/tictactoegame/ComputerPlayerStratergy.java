package design.tictactoegame;

import java.util.Random;

public class ComputerPlayerStratergy implements PlayerStratergy {
    private static final Random RANDOM = new Random();
    private static final String MOVE_ATTEMPT_FORMAT = "%s, playing at row %d and column %d:%n";
    private static final String INVALID_MOVE_MESSAGE = "Invalid Move, Try again%n";
    private static final int MAX_ATTEMPTS = 100;

    private final String playerName;
    private final int rows;
    private final int cols;

    public ComputerPlayerStratergy(String playerName, int rows, int cols) {
        this.playerName = playerName;
        this.rows = rows;
        this.cols = cols;
    }

    @Override
    public Position makeMove(Board board) {
        int attemptCount = 0;
        while (attemptCount < MAX_ATTEMPTS) {
            Position move = generateRandomMove();
            System.out.printf(MOVE_ATTEMPT_FORMAT, playerName, move.getRow(), move.getCol());

            if (board.isValidMove(move)) {
                return move;
            }

            System.out.printf(INVALID_MOVE_MESSAGE);
            attemptCount++;
        }
        throw new IllegalStateException("Computer player unable to find valid move after " + MAX_ATTEMPTS + " attempts");
    }

    private Position generateRandomMove() {
        return new Position(RANDOM.nextInt(rows), RANDOM.nextInt(cols));
    }
}
