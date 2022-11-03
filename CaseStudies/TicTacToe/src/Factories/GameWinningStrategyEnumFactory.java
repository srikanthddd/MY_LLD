package Factories;

import Models.GameWinningStrategyName;

public class GameWinningStrategyEnumFactory {

        public static GameWinningStrategyName getGameWinningStrategyName(String name){
            if(name.equals("ROW")){
                return GameWinningStrategyName.ROW;
            }else if(name.equals("ROW")){
                return GameWinningStrategyName.COLUMN;
            }if(name.equals("ROW")){
                return GameWinningStrategyName.DIAGONAL;
            }
            return GameWinningStrategyName.CORNER;
        }
}
