package TicTacToe.models;

import TicTacToe.validations.movevalidations.MoveValidation;

import java.util.Scanner;

public class HumanPlayer extends Player{
    Scanner scanner = new Scanner(System.in);
    public HumanPlayer(String name, PlayerType playerType, Character symbol) {
        super(name, playerType, new Symbol(symbol));
    }

    @Override
    Move makeMove(Board board) {
        System.out.println("It's " + this.getName() + "'s move:");
        Move move;
        do{
            System.out.println("Please enter the row:");
            int r = scanner.nextInt();
            System.out.println("Please enter the col:");
            int c = scanner.nextInt();
            //Move validation
            move  = new Move(new Cell(r, c), this);
        }while(!MoveValidation.validate(move, board));

        return move;
    }
}
