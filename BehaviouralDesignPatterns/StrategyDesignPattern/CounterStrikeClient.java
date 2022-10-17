package BehaviouralDesignPatterns.StrategyDesignPattern;

import BehaviouralDesignPatterns.StrategyDesignPattern.Strategy.AttackStrategy;
import BehaviouralDesignPatterns.StrategyDesignPattern.Strategy.DefenseStrategy;

public class CounterStrikeClient {
    public static void main(String[] args) {
        /*Player dp = new Player("DefensePlayer");
        Player ap = new Player("AttachPlayer");


        dp.setStrategy(new DefenseStrategy());
        dp.performAction();

        ap.setStrategy(new AttackStrategy());
        ap.performAction();*/

        Player dp = new Player("DefensePlayer", new DefenseStrategy());
        Player ap = new Player("AttachPlayer", new AttackStrategy());

        dp.performAction();
        ap.performAction();

    }
}
