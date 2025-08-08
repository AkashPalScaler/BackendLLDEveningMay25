package TicTacToe.strategies.WinningStrategies;

import TicTacToe.models.WinningStrategyType;

public class WinningStrategyFactory {
    public static WinningStrategy getStrategy(WinningStrategyType type){
        return switch (type) {
            case ROW -> new RowWinningStrategy();
            case COL -> new ColumnWinningStrategy();
            case DIAGONAL -> new DiagonalWinningStrategy();
            case ANTI_DIAGONAL -> new AntiDiagonalWinningStrategy();
        };
    }
}
