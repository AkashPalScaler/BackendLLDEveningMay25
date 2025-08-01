package TicTacToe.models;

import TicTacToe.validations.gamevalidations.UniqueSymbolValidation;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private Player winner;
    private GameState gameState;
    private int nextPlayerIndex; // 0 -> 1 % playerListSize=0 -> 2 % playerListSize=0
    private List<Move> moveHistory;
    private List<WinningStrategyType> winningStrategyTypes;

    public Game(Builder builder) {
        this.board = new Board(builder.size);
        this.players = builder.players;
        this.winningStrategyTypes = builder.winningStrategyTypes;
        nextPlayerIndex = 0;
        gameState = GameState.IN_PROGRESS;
        moveHistory = new ArrayList<>();
    }

    public void makeMove(){
        // Fetch player to make the move
        Player currPLayer = players.get(nextPlayerIndex);
        nextPlayerIndex = (nextPlayerIndex + 1) % players.size(); // Turning the player
        // Get the move by calling player.makeMove
        Move move = currPLayer.makeMove(board);
        // Update the board
        board.getGrid().get(move.getCell().getRow()).get(move.getCell().getCol()).setCellState(CellState.FILLED);
        board.getGrid().get(move.getCell().getRow()).get(move.getCell().getCol()).setSymbol(currPLayer.getSymbol());
        // Store the move in moveHistory
        // check winner and update game state
    }

    public Board getBoard() {
        return board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public List<Move> getMoveHistory() {
        return moveHistory;
    }

    public void setMoveHistory(List<Move> moveHistory) {
        this.moveHistory = moveHistory;
    }

    public List<WinningStrategyType> getWinningStrategyTypes() {
        return winningStrategyTypes;
    }

    public void setWinningStrategyTypes(List<WinningStrategyType> winningStrategyTypes) {
        this.winningStrategyTypes = winningStrategyTypes;
    }

//    public void displayBoard()
//        Additianal game property displays as required
//        board.display();
//    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder{
        int size;
        private List<Player> players;
        private List<WinningStrategyType> winningStrategyTypes;

        public Builder setSize(int size) {
            this.size = size;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategyTypes(List<WinningStrategyType> winningStrategyTypes) {
            this.winningStrategyTypes = winningStrategyTypes;
            return this;
        }

        void validations(){
            UniqueSymbolValidation.validate(players);

        }

        public Game build(){
            //Validations
            // If player symbols are unique
            // 2 players min and only one bot player allowed
            // Homework: create all the validation classes
            return new Game(this);
        }
    }
}
