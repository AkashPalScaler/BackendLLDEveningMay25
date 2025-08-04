package TicTacToe.strategies.BotPlayingStrategies;

import TicTacToe.models.BotDifficultyLevel;

public class BotPlayingFactory {
    public static BotPlayingStrategy getStrategy(BotDifficultyLevel botDifficultyLevel){
        if(botDifficultyLevel.equals(BotDifficultyLevel.EASY)){
            return new EasyPlayingStrategy();
        }
        throw new RuntimeException("Invalid Bot difficulty level");
    }
}
