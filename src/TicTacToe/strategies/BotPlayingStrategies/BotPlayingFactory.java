package TicTacToe.strategies.BotPlayingStrategies;

import TicTacToe.models.BotDifficultyLevel;

public class BotPlayingFactory {
    public static BotPlayingStrategy getStrategy(BotDifficultyLevel botDifficultyLevel) {
        return switch (botDifficultyLevel) {
            case EASY -> new EasyPlayingStrategy();
            case MEDIUM -> new MediumPlayingStrategy();
            default -> throw new RuntimeException("Invalid Bot difficulty level");
        };
    }
}
