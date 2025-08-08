package TicTacToe.strategies.WinningStrategies;

import TicTacToe.models.Board;
import TicTacToe.models.Move;

import java.util.HashMap;

public class RowWinningStrategy implements WinningStrategy{
    HashMap<Integer, HashMap<Character, Integer>> rowMap;

    public RowWinningStrategy(){
        rowMap = new HashMap<>();
    }

    @Override
    public boolean checkWinner(Board board, Move move) {
        // we need the row to update the hashmap
        int row = move.getCell().getRow();
        Character symbol = move.getPlayer().getSymbol().getSym();
//        if(!rowMap.containsKey(row)){
//            rowMap.put(row, new HashMap<>());
//        }
        rowMap.putIfAbsent(row, new HashMap<>());
        HashMap<Character, Integer> countMap = rowMap.get(row);
        countMap.putIfAbsent(symbol, 0);
        countMap.put(symbol, countMap.get(symbol) + 1);

        if(countMap.get(symbol) == board.getSize()){
            return true;
        }
        return false;
    }

    @Override
    public void handleUndo(Move move) {
        int row = move.getCell().getRow();
        Character symbol = move.getPlayer().getSymbol().getSym();
        HashMap<Character, Integer> countMap = rowMap.get(row);
        countMap.put(symbol, countMap.get(symbol)-1);
    }
}
