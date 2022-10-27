package Models;

import WinStrategy.WinningStrategy;

import java.util.List;

public class Game {

    private Board board;
    private List<Player> playersList;
    private List<Move> moveList;  // To do undo
    private List<WinningStrategy> winningStrategyList;
    private int lastMovedPlayerIndex;   //To store who is the player which moved the piece last.
    private GameStatus gameStatus;   // Win, Lost, Draw
    private Player winnerPlayer;

    public Game(Board board, List<Player> playersList, List<Move> moveList, List<WinningStrategy> winningStrategyList,
                int lastMovedPlayerIndex, GameStatus gameStatus, Player winnerPlayer) {
        this.board = board;
        this.playersList = playersList;
        this.moveList = moveList;
        this.winningStrategyList = winningStrategyList;
        this.lastMovedPlayerIndex = lastMovedPlayerIndex;
        this.gameStatus = gameStatus;
        this.winnerPlayer = winnerPlayer;
    }
}
