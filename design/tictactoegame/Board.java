package design.tictactoegame;

import java.util.Arrays;

public class Board {
    private static final String BOARD_HEADER = "Printing the current board\n";
    private static final String EMPTY_CELL = " . ";
    private static final String FILLED_CELL_FORMAT = " %s ";
    private static final String NEWLINE = "\n";

    private final Symbol[][] board;
    private final int rows;
    private final int column;
    private int placesFilled = 0;

    public Board(int rows, int column) {
        this.rows = rows;
        this.column = column;
        this.board = new Symbol[rows][column];
        // Initialize all cells to EMPTY using optimized Arrays.fill
        for (Symbol[] row : board) {
            Arrays.fill(row, Symbol.EMPTY);
        }
    }

    public Symbol[][] getBoard() {
        Symbol[][] copy = new Symbol[rows][];
        for (int i = 0; i < rows; i++) {
            copy[i] = new Symbol[column];
            System.arraycopy(board[i], 0, copy[i], 0, column);
        }
        return copy;
    }

    public void printBoard(){
        StringBuilder sb = new StringBuilder(BOARD_HEADER);
        for(int i = 0; i < rows; i++){
            for (int j = 0; j < column; j++){
                Symbol symbol = board[i][j];
                sb.append(symbol == Symbol.EMPTY ? EMPTY_CELL : String.format(FILLED_CELL_FORMAT, symbol));
            }
            sb.append(NEWLINE);
        }
        System.out.print(sb);
    }
    public void makeMove(Position position, Symbol symbol){
        if (!isValidMove(position)) {
            throw new IllegalArgumentException("Invalid move at position: " + position);
        }
        board[position.getRow()][position.getCol()] = symbol;
        placesFilled++;
    }
    public boolean isValidMove(Position position) {
        return isWithinBounds(position) && board[position.getRow()][position.getCol()] == Symbol.EMPTY;
    }

    private boolean isWithinBounds(Position position) {
        return position.getRow() >= 0 && position.getRow() < rows
            && position.getCol() >= 0 && position.getCol() < column;
    }
    public boolean checkWinner(Symbol s) {
        return checkRowsAndColumns(s) || checkDiagonals(s);
    }

    private boolean checkRowsAndColumns(Symbol s) {
        for (int i = 0; i < rows; i++) {
            if (checkRow(i, s) || checkColumn(i, s)) {
                return true;
            }
        }
        return false;
    }

    private boolean checkRow(int row, Symbol s) {
        for (int j = 0; j < column; j++) {
            if (board[row][j] != s) {
                return false;
            }
        }
        return true;
    }

    private boolean checkColumn(int col, Symbol s) {
        for (int i = 0; i < rows; i++) {
            if (board[i][col] != s) {
                return false;
            }
        }
        return true;
    }

    private boolean checkDiagonals(Symbol s) {
        int minDimension = Math.min(rows, column);
        return minDimension > 0 && (checkMainDiagonal(s, minDimension) || checkAntiDiagonal(s, minDimension));
    }

    private boolean checkMainDiagonal(Symbol s, int minDimension) {
        for (int i = 0; i < minDimension; i++) {
            if (board[i][i] != s) {
                return false;
            }
        }
        return true;
    }

    private boolean checkAntiDiagonal(Symbol s, int minDimension) {
        for (int i = 0; i < minDimension; i++) {
            if (board[i][column - 1 - i] != s) {
                return false;
            }
        }
        return true;
    }
    public boolean checkDraw(){
        return placesFilled == rows * column;
    }
    public int getRows() {
        return rows;
    }

    public int getColumn() {
        return column;
    }
}
