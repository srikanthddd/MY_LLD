package Models;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private int size;
    private List<List<Cell>> board;

    public Board(int size){

        this.size = size;
        this.board = new ArrayList<>();

        for(int i=0;i<size;i++){
            this.board.add(new ArrayList<>());
            for (int j=0;j<size;j++){

                this.board.get(i).add(new Cell(i, j));
            }
        }
    }

    public Cell getCell(int row, int col){
        return this.getBoard().get(row).get(col);
    }

    public int getSize() {
        return size;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void displayBoard(){
        for(List<Cell> row : board){
            for(Cell cell : row){
                if(cell.getPlayer() == null){
                    System.out.print(" - ");
                }else {
                    System.out.print(" "+ cell.getPlayer().getSymbol().getSymbolLogo());
                }
            }
            System.out.println();
        }
    }
}
