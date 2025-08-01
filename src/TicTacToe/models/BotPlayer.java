package TicTacToe.models;

public class BotPlayer extends Player{
    private BotDifficultyLevel level;
    public BotPlayer(String name, PlayerType playerType, Character symbol, BotDifficultyLevel level) {
        super(name, playerType, new Symbol(symbol));
        this.level = level;
    }

    @Override
    Move makeMove(Board board) {
        System.out.println("Botty is not playing right now");
        return null;
    }
}
