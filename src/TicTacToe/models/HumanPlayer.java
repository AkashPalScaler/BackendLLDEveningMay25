package TicTacToe.models;

public class HumanPlayer extends Player{
    public HumanPlayer(String name, PlayerType playerType, Character symbol) {
        super(name, playerType, new Symbol(symbol));
    }

    @Override
    Move makeMove() {
        return null;
    }
}
