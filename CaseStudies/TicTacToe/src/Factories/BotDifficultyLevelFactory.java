package Factories;

import Models.BotDifficultyLevel;

public class BotDifficultyLevelFactory {
    public static BotDifficultyLevel getBotDifficultyLevel(String difficulty){
        if(difficulty.equals("EASY")){
            return BotDifficultyLevel.EASY;
        }else if(difficulty.equals("MEDIUM")){
            return BotDifficultyLevel.MEDIUM;
        }
        return BotDifficultyLevel.HARD;
    }
}
