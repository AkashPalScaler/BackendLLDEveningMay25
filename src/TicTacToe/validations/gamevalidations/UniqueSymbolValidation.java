package TicTacToe.validations.gamevalidations;

import TicTacToe.exceptions.UniqueSymbolException;
import TicTacToe.models.Player;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueSymbolValidation {
    public static void validate(List<Player> players) {
        if (players.stream().map(Player::getSymbol).distinct().count() != players.size()) {
            throw new UniqueSymbolException("Duplicate symbol");
        }
    }
}
