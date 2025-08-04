package TicTacToe;

import TicTacToe.controllers.GameController;
import TicTacToe.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        GameController gameController = new GameController();

        Player akash = new HumanPlayer("Akash", PlayerType.HUMAN, 'X');
        BotDifficultyLevel botDifficultyLevel;
        do {
            System.out.println("Choose 1 for Easy Bot, 2 for Medium Bot: ");
            String difficulty = new Scanner(System.in).nextLine();
            if (difficulty.equals("1")) {
                botDifficultyLevel = BotDifficultyLevel.EASY;
                break;
            } else if (difficulty.equals("2")) {
                botDifficultyLevel = BotDifficultyLevel.MEDIUM;
                break;
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        } while (true);

        Player botty = new BotPlayer("Botty", PlayerType.BOT, 'O', botDifficultyLevel);

        List<Player> players = new ArrayList<>();
        players.add(akash);
        players.add(botty);

        List<WinningStrategyType> winningStrategyTypes = new ArrayList<>();
        winningStrategyTypes.add(WinningStrategyType.COL);
        winningStrategyTypes.add(WinningStrategyType.ROW);
        winningStrategyTypes.add(WinningStrategyType.DIAGONAL);
        winningStrategyTypes.add(WinningStrategyType.ANTI_DIAGONAL);


        Game game1 = gameController.startGame(3, players, winningStrategyTypes);
//        Game game2 = gameController.startGame();
//        gameController.displayBoard(game1);
        while(gameController.checkGameState(game1).equals(GameState.IN_PROGRESS)){
            gameController.displayBoard(game1);
            gameController.makeMove(game1);
        }

        if(gameController.checkGameState(game1).equals(GameState.DRAW)){
            System.out.println("The game is a draw");
        }else{
            System.out.println(gameController.getWinner(game1).getName() + " wins the game!");
        }
    }
}


//Home work:
//Add all validations and exception classes required
//Convert the unique symbal validation code to one line using streams
//Add Bot's make move function - For EASY and MEDIUM