package Factories;

import BotStrategy.BotPlayingStrategy;
import Models.Board;
import Models.Cell;
import Models.Move;
import Models.Player;

import java.util.List;

public class RandomBotPlayingStrategy implements BotPlayingStrategy{

    @Override
    public Move makeBotMove(Board board, Player player) {
        for(List<Cell> row : board.getBoard()){
            for(Cell cell : row){
                if(cell.getPlayer() == null){
                    return new Move(cell.getRow(), cell.getCol(), player);
                }
            }
        }
        return null;
    }
}
