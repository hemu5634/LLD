package design.tictactoegame;

public class PlayerX implements Player{
    final Symbol symbol = Symbol.X;
    PlayerStratergy stratergy;

    public PlayerX(PlayerStratergy stratergy) {
        this.stratergy = stratergy;
    }

    @Override
    public Symbol getSymbol() {
        return symbol;
    }

    @Override
    public int[] makeMove() {
        return stratergy.makeMove();
    }
}
