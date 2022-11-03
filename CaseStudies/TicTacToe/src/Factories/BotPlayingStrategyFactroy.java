package Factories;

import BotStrategy.BotPlayingStrategy;
import Models.BotDifficultyLevel;

public class BotPlayingStrategyFactroy {

    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel){
        //return switch (botDifficultyLevel){
          //  case EASY -> new RandomBotPlayingStrategy();
        //}
        return new RandomBotPlayingStrategy();
    }
}
