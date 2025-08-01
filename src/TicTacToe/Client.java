package TicTacToe;

import TicTacToe.controllers.GameController;
import TicTacToe.models.*;

import java.util.ArrayList;
import java.util.List;

public class Client {
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
        gameController.displayBoard(game1);
//        while(gameController.checkGameState(game1).equals(GameState.IN_PROGRESS)){
//            gameController.displayBoard(game1);
//            gameController.makeMove(game1);
//
//        }

        if(gameController.checkGameState(game1).equals(GameState.DRAW)){
            System.out.println("The game is a draw");
        }else{
            System.out.println(gameController.getWinner(game1).getName() + " wins the game!");
        }
    }
}
