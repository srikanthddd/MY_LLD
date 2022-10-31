package Models;

import BotStrategy.BotPlayingStrategy;
import Factories.BotPlayingStrategyFactroy;

public class Bot extends Player{

    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public Bot(BotDifficultyLevel botDifficultyLevel){
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactroy.getBotPlayingStrategy(botDifficultyLevel);
    }

    public Move makeMove(Board board) {
        return botPlayingStrategy.makeBotMove(board, this);
    }
}
