package TicTacToe.validations.movevalidations;

import TicTacToe.models.Board;
import TicTacToe.models.CellState;
import TicTacToe.models.Move;

public class MoveValidation {
    public static boolean validate(Move move, Board board){
        int r = move.getCell().getRow();
        int c = move.getCell().getCol();
        if(r<0 || r> board.getSize() || c< 0 || c > board.getSize()){
            System.out.println("Invalid move: Out of the board.\nPlease try again!");
            return false;
        }
        CellState cellState = board.getGrid().get(r).get(c).getCellState();
        if(cellState.equals(CellState.FILLED) || cellState.equals(CellState.BLOCKED)){
            System.out.println("Invalid move: Cell is blocked or already occupied.\nPlease try again!");
            return false;
        }
        return true;
        // Create separate exceptions for the above
    }
}
