package TicTacToe.strategies.BotPlayingStrategies;

import TicTacToe.models.*;

import java.util.HashSet;
import java.util.Set;

public class MediumPlayingStrategy implements BotPlayingStrategy {

    @Override
    public Move makeMove(Board board, Player player) {
        Set<Cell> cellSet = new HashSet<>();

        do {
            int row = (int) (Math.random() * board.getSize());
            int col = (int) (Math.random() * board.getSize());
            Cell cell = board.getGrid().get(row).get(col);
            if (cellSet.add(cell) && cell.getCellState().equals(CellState.EMPTY)) {
                return new Move(cell, player);
            }
        } while (cellSet.size() != board.getSize() * board.getSize());
        return null;
    }
}
