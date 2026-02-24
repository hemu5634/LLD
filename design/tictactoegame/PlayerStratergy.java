package design.tictactoegame;

public class PlayerStratergy{
    private String stratergy;

    public PlayerStratergy(String stratergy){
        this.stratergy = stratergy;
    }

    public int[] makeMove() {
        switch (stratergy){
            case "human":
                return HumanPlayer.makeMove();
            default:
                return null;
        }
    }
}
