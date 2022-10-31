package WinStrategy;

import Models.Board;
import Models.Cell;
import Models.Move;
import Models.Symbol;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RowWinningStrategy implements GameWinningStrategy{

    @Override
    public Boolean checkVictory(Board board, Move lastMove) {
        Set<Character> characterSet = new HashSet<>();
        for(List<Cell> row : board.getBoard()){
            boolean isSame = true;
            for(Cell cell : row){
                if(cell.getPlayer()!=null){
                    characterSet.add(cell.getPlayer().getSymbol().getSymbolLogo());
                }else {
                    return  false;
                }
            }
            if(characterSet.size() == 1){
                return true;
            }
        }
        return false;
    }
}
