package TicTacToe.models;

import TicTacToe.strategies.BotPlayingStrategies.BotPlayingFactory;
import TicTacToe.strategies.BotPlayingStrategies.BotPlayingStrategy;

public class BotPlayer extends Player{
    private BotDifficultyLevel level;
    public BotPlayer(String name, PlayerType playerType, Character symbol, BotDifficultyLevel level) {
        super(name, playerType, new Symbol(symbol));
        this.level = level;
    }

    @Override
    Move makeMove(Board board) {
        System.out.println("It's " + this.getName() + "'s move:");
        BotPlayingStrategy botPlayingStrategy = BotPlayingFactory.getStrategy(level);
        return botPlayingStrategy.makeMove(board, this);
    }
}
