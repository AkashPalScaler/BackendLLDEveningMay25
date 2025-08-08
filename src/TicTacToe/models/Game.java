package TicTacToe.models;

import TicTacToe.strategies.WinningStrategies.WinningStrategy;
import TicTacToe.strategies.WinningStrategies.WinningStrategyFactory;
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
    private List<WinningStrategy> winningStrategies;

    public Game(Builder builder) {
        this.board = new Board(builder.size);
        this.players = builder.players;
        this.winningStrategyTypes = builder.winningStrategyTypes;
        this.winningStrategies = new ArrayList<>();
        winningStrategyTypes.forEach( type -> {
            winningStrategies.add(WinningStrategyFactory.getStrategy(type));
        });
        nextPlayerIndex = 0;
        gameState = GameState.IN_PROGRESS;
        moveHistory = new ArrayList<>();
    }

    public boolean checkWinner(Move move){
        for(WinningStrategy strategy : winningStrategies){
            if(strategy.checkWinner(board, move)){
                return true;
            }
        }
        return false;
    }

    public void undo(){
        // We need to revert all the steps done to make a move
        // Check if any move is there to undo
        if(moveHistory.isEmpty()){
            throw new RuntimeException("No moves to undo!");
        }
        // roll back the nextPlayerIndex
        nextPlayerIndex = (nextPlayerIndex -1 + players.size()) % players.size(); // (A - B) % N -> (A -B +N)%N
        // Get and remove move from history
        Move move = moveHistory.removeLast();
        // Revert the move from the board - update the cells
        board.getGrid().get(move.getCell().getRow()).get(move.getCell().getCol()).setCellState(CellState.EMPTY);
        board.getGrid().get(move.getCell().getRow()).get(move.getCell().getCol()).setSymbol(null);

        // Revert the strategy count map
        for(WinningStrategy strategy : winningStrategies) {
            strategy.handleUndo(move);
        }
        // Set the winner to null
        setWinner(null);
        // Set the gameState to IN_PROGRESS
        setGameState(GameState.IN_PROGRESS);
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
        // Store the move in moveHistory - undo
        moveHistory.add(move);

        // check winner and update game state
        if(checkWinner(move)){
            setWinner(currPLayer);
            setGameState(GameState.SUCCESS);
        }else if(moveHistory.size() == board.getSize() * board.getSize()){
            setWinner(null);
            setGameState(GameState.DRAW);
        }

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
