package Factories;

import Models.GameWinningStrategyName;
import WinStrategy.GameWinningStrategy;
import WinStrategy.RowWinningStrategy;

public class GameWinningStrategyFactory {

    public static GameWinningStrategy getGameWinningStrategyByName(GameWinningStrategyName gameWinningStrategyName){
        return switch (gameWinningStrategyName){
            case ROW -> new RowWinningStrategy();
            case COLUMN -> null;
            case CORNER -> null;
            case DIAGONAL -> null;
        };
    }
}
