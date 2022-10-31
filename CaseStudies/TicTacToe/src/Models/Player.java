package Models;

import BotStrategy.BotPlayingStrategy;

import java.util.Scanner;

public class Player {

    private Symbol symbol;
    private String name;
    private PlayerType playerType;


   /* public Player(Symbol symbol, String name, PlayerType playerType){
        this.symbol = symbol;
        this.name = name;
        this.playerType = playerType;
    }*/

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Move makeMove(Board board) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What row (Starting from 1)");
        Integer row = sc.nextInt();

        System.out.println("What col (Starting from 1)");
        Integer col = sc.nextInt();



        Move move = new Move(row, col, this);

        return move;
    }
}
