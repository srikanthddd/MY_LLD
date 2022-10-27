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
                    System.out.println(" - ");
                }else {
                    System.out.println(" "+ cell.getPlayer().getSymbol().getSymbolLogo());
                }
            }
        }
    }
}
