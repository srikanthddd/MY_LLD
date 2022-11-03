package Models;

import Exceptions.DuplicateSymbolException;
import WinStrategy.GameWinningStrategy;
import Factories.GameWinningStrategyFactory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Game {

    public Board getBoard() {
        return board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<Move> getMoveList() {
        return moveList;
    }

    public List<GameWinningStrategy> getWinningStrategyList() {
        return winningStrategyList;
    }

    public int getLastMovedPlayerIndex() {
        return lastMovedPlayerIndex;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public Player getWinnerPlayer() {
        return winnerPlayer;
    }

    private Board board;
    private List<Player> players;
    private List<Move> moveList;
    private List<GameWinningStrategy> winningStrategyList;
    private int lastMovedPlayerIndex;
    private GameStatus gameStatus;
    private Player winnerPlayer;

    private int filledSize;

    private Game(){

    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public void makeMove() {
        this.lastMovedPlayerIndex += 1;
        this.lastMovedPlayerIndex %= players.size();

        System.out.println(this.players.get(lastMovedPlayerIndex).getName() + "'s turn");
        Move potentialMove = this.players.get(this.lastMovedPlayerIndex).makeMove(this.board);

        if(this.getBoard().getCell(potentialMove.getRow(), potentialMove.getCol()).getPlayer() !=null ){
            System.out.println("Bad Move, Try Again !!");
            return;
        }

        this.moveList.add(potentialMove);
        this.board.getCell(potentialMove.getRow(), potentialMove.getCol()).setPlayer(this.players.get(lastMovedPlayerIndex));

        filledSize += 1;

        //System.out.println("winningStrategyList size : " +winningStrategyList.size());


        for (GameWinningStrategy gameWinningStrategy: winningStrategyList){
            if(gameWinningStrategy.checkVictory(this.board, potentialMove)){
                gameStatus = GameStatus.ENDED;
                winnerPlayer = this.players.get(lastMovedPlayerIndex);
                return;
            }
        }
        int totalSize = (this.players.size() + 1) * (this.players.size() + 1);
        if(filledSize == totalSize){
            gameStatus = GameStatus.DRAW;
        }

    }

    public static class Builder{

        private List<Player> players;
        private List<GameWinningStrategy> winningStrategyList;
        private Player WinnerPlayer;

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategyList(List<GameWinningStrategyName> gameWinningStrategyNames) {
            this.winningStrategyList = new ArrayList<>();

            for(GameWinningStrategyName gameWinningStrategyName : gameWinningStrategyNames){
                this.winningStrategyList.add(GameWinningStrategyFactory.getGameWinningStrategyByName(gameWinningStrategyName));
            }

            return this;
        }

        public Builder setWinnerPlayer(Player winnerPlayer) {
            WinnerPlayer = winnerPlayer;
            return this;
        }

        public Game build(){  // This does the validation and returns the game object

            Set<Character> alreadyExistingCharacters = new HashSet<>();

            for(Player player : players){
                if(alreadyExistingCharacters.contains(player.getSymbol())){
                    throw new DuplicateSymbolException(player.getSymbol().getSymbolLogo());
                }else alreadyExistingCharacters.add(player.getSymbol().getSymbolLogo());
            }
            Game game = new Game();
            game.gameStatus = GameStatus.IN_PROGRESS;
            game.winningStrategyList = winningStrategyList;
            game.players = players;
            game.moveList = new ArrayList<>();
            game.board = new Board(players.size() + 1);
            game.lastMovedPlayerIndex = -1;

            return  game;
        }



        // The below attributes are not added as part of builder class, because these are not set by client during game creation.
        //  private Board board;
        //  private List<Move> moveList;
        //  private int lastMovedPlayerIndex;
        //  private GameStatus gameStatus;



        /*
            We do not want to use this, instead we use builder pattern.
            public Game(Board board, List<Player> playersList, List<Move> moveList, List<WinningStrategy> winningStrategyList,
                        int lastMovedPlayerIndex, GameStatus gameStatus, Player winnerPlayer) {
                this.board = board;
                this.playersList = playersList;
                this.moveList = moveList;
                this.winningStrategyList = winningStrategyList;
                this.lastMovedPlayerIndex = lastMovedPlayerIndex;
                this.gameStatus = gameStatus;
                this.winnerPlayer = winnerPlayer;
        }*/

    }

}
