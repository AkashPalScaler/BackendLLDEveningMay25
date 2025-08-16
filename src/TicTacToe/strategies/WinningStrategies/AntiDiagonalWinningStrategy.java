package TicTacToe.strategies.WinningStrategies;

import TicTacToe.models.Board;
import TicTacToe.models.Cell;
import TicTacToe.models.Move;

public class AntiDiagonalWinningStrategy implements WinningStrategy {
    @Override
    public boolean checkWinner(Board board, Move move) {
        int size = board.getSize();
        Character symbol = move.getPlayer().getSymbol().getSym();

        for (int i = 0; i < size; i++) {
            Cell cell = board.getGrid().get(i).get(size - 1 - i);
            if (cell == null || cell.getSymbol() == null || !cell.getSymbol().getSym().equals(symbol)) {
                return false;
            }
        }
        return true;
    }
}
