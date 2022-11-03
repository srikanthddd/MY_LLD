import Factories.BotDifficultyLevelFactory;
import Factories.GameWinningStrategyEnumFactory;
import Factories.PlayerFactory;
import Models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many players?");
        int numberOfPlayers = sc.nextInt();

        System.out.println("How many Bot players?");
        int numberOfBot = sc.nextInt();

        List<Player> players = new ArrayList<>();

        for (int i=0;i<numberOfBot;++i){
            System.out.println("Name of Bot "+" ");
            String botName = sc.next();

            System.out.println("Symbol of Bot " + (i + 1));
            Character ch = sc.next().charAt(0);

            System.out.println("Difficulty level of Bot " + (i + 1));
            String difficultyLevel = sc.next();

            BotDifficultyLevel botDifficultyLevel = BotDifficultyLevelFactory.getBotDifficultyLevel(difficultyLevel);

            players.add(PlayerFactory.createBotPlayer(botName, ch, botDifficultyLevel));
        }

        for (int i=numberOfBot;i<numberOfPlayers;++i){
            System.out.println("Name of Player "+ (i - numberOfBot + 1));
            String playerName = sc.next();

            System.out.println("Symbol of Player " + (i + 1));
            Character ch = sc.next().charAt(0);

            players.add(PlayerFactory.createHumanPlayer(playerName, ch));
        }

        System.out.println("How many winning strategies");
        Integer winningStrategiesCount = sc.nextInt();

        List<GameWinningStrategyName> gameWinningStrategyNames = new ArrayList<>();

        for(int i=0;i<winningStrategiesCount;i++){
            System.out.println("Name Strategy " + i);
            String strategy = sc.next();
            gameWinningStrategyNames.add(GameWinningStrategyEnumFactory.getGameWinningStrategyName(strategy));
        }

        Game game = Game.getBuilder()
                .setWinningStrategyList(gameWinningStrategyNames)
                .setPlayers(players).build();

        while(game.getGameStatus().equals(GameStatus.IN_PROGRESS)){
            game.getBoard().displayBoard();
            game.makeMove();
        }

        if(game.getGameStatus().equals(GameStatus.ENDED)){
            System.out.println("****************************************");
            System.out.println("The winner is :"+game.getWinnerPlayer().getName());
            System.out.println("****************************************");
            return;
        }
        if(game.getGameStatus().equals(GameStatus.DRAW)){
            System.out.println("No result, the game is draw. Please start the game again");
            return;
        }

    }
}
