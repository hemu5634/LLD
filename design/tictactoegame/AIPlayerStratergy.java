package design.tictactoegame;


public class AIPlayerStratergy implements PlayerStratergy {
    private static final int WINNING_SCORE = 100;
    private static final int LOSING_SCORE = -100;
    private static final int DRAW_SCORE = 0;

    private final String playerName;
    private final Symbol aiSymbol;
    private final Symbol opponentSymbol;

    public AIPlayerStratergy(String playerName, Symbol aiSymbol) {
        this.playerName = playerName;
        this.aiSymbol = aiSymbol;
        this.opponentSymbol = (aiSymbol == Symbol.X) ? Symbol.O : Symbol.X;
    }

    @Override
    public Position makeMove(Board board) {
        System.out.printf("%s (AI) is thinking...%n", playerName);

        Position bestMove = findBestMove(board);

        if (bestMove != null) {
            System.out.printf("%s (AI) playing at row %d and column %d:%n", playerName, bestMove.getRow(), bestMove.getCol());
            return bestMove;
        }

        throw new IllegalStateException("AI unable to find valid move");
    }

    private Position findBestMove(Board board) {
        Position bestMove = null;
        int bestScore = Integer.MIN_VALUE;

        for (int row = 0; row < board.getRows(); row++) {
            for (int col = 0; col < board.getColumn(); col++) {
                Position position = new Position(row, col);

                if (board.isValidMove(position)) {
                    // Get a copy of the board
                    Symbol[][] boardCopy = createBoardCopy(board);

                    // Make the move on the copy
                    boardCopy[row][col] = aiSymbol;

                    // Calculate score for this move using minimax
                    int score = minimax(boardCopy, board, 0, false, Integer.MIN_VALUE, Integer.MAX_VALUE);

                    // Update best move if this is better
                    if (score > bestScore) {
                        bestScore = score;
                        bestMove = position;
                    }
                }
            }
        }

        return bestMove;
    }

    /**
     * Creates a copy of the board state for AI exploration.
     */
    private Symbol[][] createBoardCopy(Board board) {
        Symbol[][] original = board.getBoard();
        Symbol[][] copy = new Symbol[original.length][];
        for (int i = 0; i < original.length; i++) {
            copy[i] = new Symbol[original[i].length];
            System.arraycopy(original[i], 0, copy[i], 0, original[i].length);
        }
        return copy;
    }

    private int minimax(Symbol[][] boardCopy, Board originalBoard, int depth, boolean isMaximizing, int alpha, int beta) {
        // Check terminal states
        if (checkWinnerOnCopy(boardCopy, aiSymbol)) {
            return WINNING_SCORE - depth;
        }
        if (checkWinnerOnCopy(boardCopy, opponentSymbol)) {
            return LOSING_SCORE + depth;
        }
        if (checkDrawOnCopy(boardCopy)) {
            return DRAW_SCORE;
        }

        if (isMaximizing) {
            return maximizeScore(boardCopy, originalBoard, depth, alpha, beta);
        } else {
            return minimizeScore(boardCopy, originalBoard, depth, alpha, beta);
        }
    }

    /**
     * Checks if a symbol has won on the board copy.
     */
    private boolean checkWinnerOnCopy(Symbol[][] boardCopy, Symbol symbol) {
        // Check rows
        for (int i = 0; i < boardCopy.length; i++) {
            if (checkRowWin(boardCopy, i, symbol)) {
                return true;
            }
        }

        // Check columns
        for (int j = 0; j < boardCopy[0].length; j++) {
            if (checkColumnWin(boardCopy, j, symbol)) {
                return true;
            }
        }

        // Check diagonals
        if (checkMainDiagonalWin(boardCopy, symbol) || checkAntiDiagonalWin(boardCopy, symbol)) {
            return true;
        }

        return false;
    }

    private boolean checkRowWin(Symbol[][] boardCopy, int row, Symbol symbol) {
        for (int col = 0; col < boardCopy[row].length; col++) {
            if (boardCopy[row][col] != symbol) {
                return false;
            }
        }
        return true;
    }

    private boolean checkColumnWin(Symbol[][] boardCopy, int col, Symbol symbol) {
        for (int row = 0; row < boardCopy.length; row++) {
            if (boardCopy[row][col] != symbol) {
                return false;
            }
        }
        return true;
    }

    private boolean checkMainDiagonalWin(Symbol[][] boardCopy, Symbol symbol) {
        int minDimension = Math.min(boardCopy.length, boardCopy[0].length);
        for (int i = 0; i < minDimension; i++) {
            if (boardCopy[i][i] != symbol) {
                return false;
            }
        }
        return minDimension > 0;
    }

    private boolean checkAntiDiagonalWin(Symbol[][] boardCopy, Symbol symbol) {
        int rows = boardCopy.length;
        int cols = boardCopy[0].length;
        int minDimension = Math.min(rows, cols);
        for (int i = 0; i < minDimension; i++) {
            if (boardCopy[i][cols - 1 - i] != symbol) {
                return false;
            }
        }
        return minDimension > 0;
    }

    /**
     * Checks if the board copy is full (draw condition).
     */
    private boolean checkDrawOnCopy(Symbol[][] boardCopy) {
        for (Symbol[] row : boardCopy) {
            for (Symbol cell : row) {
                if (cell == Symbol.EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private int maximizeScore(Symbol[][] boardCopy, Board originalBoard, int depth, int alpha, int beta) {
        int maxScore = Integer.MIN_VALUE;

        for (int row = 0; row < boardCopy.length; row++) {
            for (int col = 0; col < boardCopy[0].length; col++) {
                if (boardCopy[row][col] == Symbol.EMPTY) {
                    // Create a new copy for this branch
                    Symbol[][] newCopy = copyBoardArray(boardCopy);
                    newCopy[row][col] = aiSymbol;

                    int score = minimax(newCopy, originalBoard, depth + 1, false, alpha, beta);

                    maxScore = Math.max(score, maxScore);
                    alpha = Math.max(alpha, maxScore);

                    // Beta cutoff
                    if (beta <= alpha) {
                        return maxScore;
                    }
                }
            }
        }

        return maxScore;
    }

    private int minimizeScore(Symbol[][] boardCopy, Board originalBoard, int depth, int alpha, int beta) {
        int minScore = Integer.MAX_VALUE;

        for (int row = 0; row < boardCopy.length; row++) {
            for (int col = 0; col < boardCopy[0].length; col++) {
                if (boardCopy[row][col] == Symbol.EMPTY) {
                    // Create a new copy for this branch
                    Symbol[][] newCopy = copyBoardArray(boardCopy);
                    newCopy[row][col] = opponentSymbol;

                    int score = minimax(newCopy, originalBoard, depth + 1, true, alpha, beta);

                    minScore = Math.min(score, minScore);
                    beta = Math.min(beta, minScore);

                    // Alpha cutoff
                    if (beta <= alpha) {
                        return minScore;
                    }
                }
            }
        }

        return minScore;
    }

    private Symbol[][] copyBoardArray(Symbol[][] boardCopy) {
        Symbol[][] newCopy = new Symbol[boardCopy.length][];
        for (int i = 0; i < boardCopy.length; i++) {
            newCopy[i] = new Symbol[boardCopy[i].length];
            System.arraycopy(boardCopy[i], 0, newCopy[i], 0, boardCopy[i].length);
        }
        return newCopy;
    }
}




