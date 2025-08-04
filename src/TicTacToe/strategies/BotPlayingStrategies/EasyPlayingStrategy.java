package TicTacToe.strategies.BotPlayingStrategies;

import TicTacToe.models.*;

import java.util.List;

public class EasyPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Move makeMove(Board board, Player player) {
        for(List<Cell> row : board.getGrid()){
            for(Cell cell : row){
                if(cell.getCellState().equals(CellState.EMPTY)){
                    return new Move(cell, player);
                }
            }
        }
        return null;
    }
}
