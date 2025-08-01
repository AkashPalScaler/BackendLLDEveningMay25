package TicTacToe.validations.gamevalidations;

import TicTacToe.exceptions.UniqueSymbolException;
import TicTacToe.models.Player;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueSymbolValidation {
    public static void validate(List<Player> players){
        Set<Character> symbolSet = new HashSet<>();
        for(Player player : players){
            if(symbolSet.contains(player.getSymbol().getSym())){
                throw new UniqueSymbolException("Duplicate symbol");
            }else{
                symbolSet.add(player.getSymbol().getSym());
            }
        }

        // Homework -> Do this in one line using streams
    }
}
