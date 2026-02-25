package design.tictactoegame;

public class Player {
    private final Symbol symbol;
    private final PlayerStratergy strategy;

    public Player(Symbol symbol, PlayerStratergy strategy) {
        this.symbol = symbol;
        this.strategy = strategy;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public PlayerStratergy getStrategy() {
        return strategy;
    }
}
