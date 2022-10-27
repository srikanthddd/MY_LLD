package Models;

import BotStrategy.BotPlayingStrategy;

public class Bot{

    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public void Bot(BotDifficultyLevel botDifficultyLevel){
        this.botDifficultyLevel = botDifficultyLevel;
        //this.botPlayingStrategy = botDifficultyLevel.get
    }
}
