package BotStrategy;

import Models.Board;
import Models.Move;
import Models.Player;

public interface BotPlayingStrategy {

    Move makeBotMove(Board board, Player player);
}
