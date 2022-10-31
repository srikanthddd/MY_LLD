package WinStrategy;

import Models.Board;
import Models.Move;

public class ColumnWinningStrategy implements GameWinningStrategy{
    @Override
    public Boolean checkVictory(Board board, Move lastMove) {
        return false;
    }
}
