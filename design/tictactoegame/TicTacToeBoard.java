package design.tictactoegame;

public class TicTacToeBoard implements Board{
    private Symbol[][] board;
    private int rows;
    private int column;
    private Player playerO;
    private Player playerX;
    private Player currentPlayer;
    private boolean gameover;
    private int places=0;

    public TicTacToeBoard(int rows,int column,String player1,String player2){
        this.rows=rows;
        this.column=column;
        board = new Symbol[rows][column];
        for(int i =0;i<rows;i++){
            for (int j=0;j<column;j++){
                board[i][j] = Symbol.Empty;
            }
        }
        playerX = new PlayerX(new PlayerStratergy(player1));
        playerO = new PlayerO(new PlayerStratergy(player2));
        currentPlayer = playerX;
        gameover = false;
    }

    @Override
    public void play() {
        do{
            printBoard();
            System.out.println("\nPlayer "+currentPlayer.getSymbol()+" to move");
            int[] curr = currentPlayer.makeMove();
            boolean validMove = validateAndMove(curr);
            if(!validMove){
                System.out.println("Not a valid move try again");
                continue;
            }
            checkWinner();
            checkDraw();
            switchPlayer();
        }while (!gameover);

    }
    private void printBoard(){
        System.out.println("Printing the current board");
        for(int i =0;i<rows;i++){
            for (int j=0;j<column;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    private boolean validateAndMove(int[] curr){
        int r = curr[0];
        int c = curr[1];
        if(r>0 && c>0 && r<=rows && c<=column && board[--r][--c]==Symbol.Empty){
            board[r][c]=currentPlayer.getSymbol();
            places++;
            return true;
        }
        return false;
    }
    private void checkWinner(){
        Symbol s = currentPlayer.getSymbol();
        for(int i = 0;i<rows;i++){
            int rcount=0;
            int ccount=0;
            for(int j=0;j<column;j++){
              if(board[i][j]==s)
                  rcount++;
              if(board[j][i]==s)
                  ccount++;
            }
            if(rcount==rows || ccount==column)
                announceWinner();
        }
        int r =rows-1;
        int diagonal1=0;
        int diagonal2=0;
        for(int i =0;i<column;i++){
            if(board[i][i]==s)
                diagonal1++;
            if(r>=0&& board[i][r--]==s)
                diagonal2++;
        }
        int max = Math.max(rows,column);
        if(diagonal1==max||diagonal2==max){
            announceWinner();
        }
    }
    private void checkDraw(){
        if(places==rows*column){
            System.out.println("The Match is draw");
            gameover=true;
        }
    }
    private void switchPlayer(){
        currentPlayer = currentPlayer==playerX?playerO:playerX;
    }

    private void announceWinner(){
        System.out.println("\nPlayer " + currentPlayer.getSymbol() + " Won");
        printBoard();
        gameover=true;
    }
}
