package design.tictactoegame;

import java.util.Scanner;

public class HumanPlayerStratergy implements PlayerStratergy {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String MOVE_PROMPT = "%s, enter your move (row [0-%d] and column [0-%d]): ";
    private static final String INVALID_MOVE_MESSAGE = "Invalid Move, Try again%n";
    private static final String INVALID_INPUT_MESSAGE = "Invalid Input: enter row and column as numbers%n";
    private static final int MAX_ATTEMPTS = 100;

    private final String playerName;

    public HumanPlayerStratergy(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public Position makeMove(Board board) {
        int attemptCount = 0;

        while (attemptCount < MAX_ATTEMPTS) {
            System.out.printf(MOVE_PROMPT, playerName, board.getRows() - 1, board.getColumn() - 1);

            try {
                int row = SCANNER.nextInt();
                int col = SCANNER.nextInt();

                Position move = new Position(row, col);
                if (board.isValidMove(move)) {
                    return move;
                }

                System.out.printf(INVALID_MOVE_MESSAGE);
                attemptCount++;
            } catch (Exception e) {
                System.out.printf(INVALID_INPUT_MESSAGE);
                clearInputBuffer();
                attemptCount++;
            }
        }
        throw new IllegalStateException("Player unable to make valid move after " + MAX_ATTEMPTS + " attempts");
    }

    private void clearInputBuffer() {
        if (SCANNER.hasNextLine()) {
            SCANNER.nextLine();
        }
    }
}

