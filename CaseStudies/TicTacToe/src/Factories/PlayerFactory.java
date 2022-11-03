package Factories;

import Models.*;

public class PlayerFactory {

    public static Player createHumanPlayer(String name, Character ch){
        Player player = new Player();
        player.setPlayerType(PlayerType.HUMAN);
        player.setName(name);
        player.setSymbol(new Symbol(ch));

        return player;
    }

    public static Player createBotPlayer(String name, Character ch, BotDifficultyLevel botDifficultyLevel){
        Bot bot = new Bot(botDifficultyLevel);
        bot.setName(name);
        bot.setPlayerType(PlayerType.BOT);
        bot.setSymbol(new Symbol(ch));
        return bot;
    }
}
