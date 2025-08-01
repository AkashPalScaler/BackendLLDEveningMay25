package TicTacToe.exceptions;

import TicTacToe.validations.gamevalidations.UniqueSymbolValidation;

public class UniqueSymbolException extends RuntimeException{
    public UniqueSymbolException(String message){
        super(message);
    }
}
