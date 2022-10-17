package BehaviouralDesignPatterns.StrategyDesignPattern.Strategy;

public class DefenseStrategy implements IStrategy {
    @Override
    public void action() {
        System.out.println("Defense Stragey is Applied");
    }
}
