package TicTacToe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    List<List<Cell>> grid;
    int size;

    public Board(int size) {
        this.grid = new ArrayList<>();
        for(int i=0;i<size;i++){
            grid.add(new ArrayList<>());
            for(int j=0;j<size;j++){
                grid.get(i).add(new Cell(i, j));
            }
        }
        this.size = size;
    }

    public List<List<Cell>> getGrid() {
        return grid;
    }

    public void setGrid(List<List<Cell>> grid) {
        this.grid = grid;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void display(){
        for(List<Cell> row : grid){
            for(Cell cell : row){
                cell.display();
            }
            System.out.println();
        }
    }
}
