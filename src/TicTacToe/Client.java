package TicTacToe;

import TicTacToe.controllers.GameController;
import TicTacToe.models.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        GameController gameController = new GameController();

        Player akash = new HumanPlayer("Akash", PlayerType.HUMAN, 'X');
        Player botty = new BotPlayer("Botty", PlayerType.BOT, 'O', BotDifficultyLevel.EASY);

        List<Player> players = new ArrayList<>();
        players.add(akash);
        players.add(botty);

        List<WinningStrategyType> winningStrategyTypes = new ArrayList<>();
        winningStrategyTypes.add(WinningStrategyType.COL);
        winningStrategyTypes.add(WinningStrategyType.ROW);


        Game game1 = gameController.startGame(3, players, winningStrategyTypes);
//        Game game2 = gameController.startGame();
//        gameController.displayBoard(game1);
        while(gameController.checkGameState(game1).equals(GameState.IN_PROGRESS)){
            gameController.displayBoard(game1);
            gameController.makeMove(game1);
            gameController.displayBoard(game1);
            System.out.println("Do you want to undo your move? [Y/N]");
            String input = scanner.nextLine();
            if(input.equals("Y")){
                gameController.undo(game1);
            }

        }

        if(gameController.checkGameState(game1).equals(GameState.DRAW)){
            System.out.println("The game is a draw");
        }else{
            System.out.println(gameController.getWinner(game1).getName() + " wins the game!");
        }
    }
}


//Home work 1:
//Add all validations and exception classes required
//Convert the unique symbal validation code to one line using streams
//Add Bot's make move function - For EASY and MEDIUM

//Homework 2;
// Finish Winning strategies
// Multiple undos - How many moves do you want to undo? [For no undo press 0].

//LARGER HOMEWORK:
// CONVERT THIS INTO REST API ONCE YOU LEARN HOW IN PROJECT MODULE
// BUILD TOURNAMENT AND LEADERBOARD