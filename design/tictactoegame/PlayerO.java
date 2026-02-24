package design.tictactoegame;

public class PlayerO implements Player{
    final Symbol symbol = Symbol.O;
    PlayerStratergy stratergy;

    public PlayerO(PlayerStratergy stratergy) {
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
