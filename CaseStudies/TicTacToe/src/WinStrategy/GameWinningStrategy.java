package WinStrategy;

import Models.Board;
import Models.Bot;
import Models.Move;

public interface GameWinningStrategy {

    Boolean checkVictory(Board board, Move lastMove);
}
