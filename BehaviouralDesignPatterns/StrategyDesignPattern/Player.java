package BehaviouralDesignPatterns.StrategyDesignPattern;

import BehaviouralDesignPatterns.StrategyDesignPattern.Strategy.IStrategy;

public class Player {

    IStrategy behavior;
    String playerType;

    public Player(String playerType, IStrategy behavior){
        this.playerType = playerType;
        this.behavior  = behavior;
    }

    /*public void setStrategy(IStrategy iStrategy){
        this.behavior = iStrategy;
    }*/

    public void performAction(){
        this.behavior.action();
    }


}
