package TicTacToe.strategies.WinningStrategies;

import TicTacToe.models.Board;
import TicTacToe.models.Move;

import java.util.HashMap;

public class ColumnWinningStrategy implements WinningStrategy{
    HashMap<Integer, HashMap<Character, Integer>> colMap;

    public ColumnWinningStrategy(){
        colMap = new HashMap<>();
    }

    @Override
    public boolean checkWinner(Board board, Move move) {
        // we need the col to update the hashmap
        int col = move.getCell().getCol();
        Character symbol = move.getPlayer().getSymbol().getSym();
        colMap.putIfAbsent(col, new HashMap<>());
        HashMap<Character, Integer> countMap = colMap.get(col);
        countMap.putIfAbsent(symbol, 0);
        countMap.put(symbol, countMap.get(symbol) + 1);

        if(countMap.get(symbol) == board.getSize()){
            return true;
        }
        return false;
    }
}
