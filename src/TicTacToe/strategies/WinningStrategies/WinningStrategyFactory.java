package TicTacToe.strategies.WinningStrategies;

import TicTacToe.models.WinningStrategyType;

public class WinningStrategyFactory {
    public static WinningStrategy getStrategy(WinningStrategyType type){
        if(type.equals(WinningStrategyType.ROW)){
            return new RowWinningStrategy();
        }else if(type.equals(WinningStrategyType.COL)){
            return new ColumnWinningStrategy();
        }
        throw new RuntimeException("Invalid winning strategy");
    }
}
