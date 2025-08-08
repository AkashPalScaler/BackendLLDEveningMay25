package TicTacToe.controllers;

import TicTacToe.models.*;

import java.util.List;

public class GameController {
    // Getting game id
    public Game startGame(int size, List<Player> players, List<WinningStrategyType> winningStrategyTypes){
        Game game = Game.getBuilder()
                .setSize(size)
                .setPlayers(players)
                .setWinningStrategyTypes(winningStrategyTypes)
                .build();
        return game;// game_id
    }

    public void displayBoard(Game game){
        game.getBoard().display();
    }

    public void makeMove(Game game) {
        game.makeMove();
    }

    public GameState checkGameState(Game game){
        return game.getGameState();
    }

    public Player getWinner(Game game){
        return game.getWinner();
    }

    public void undo(Game game){
        game.undo();
    }
}

// 1. Start a game with given inputs/configs
// 2. Initialise and Display the board
// 3. Make Moves
// 4. Get Game status
// 5. Get Game winner