package BehaviouralDesignPatterns.StrategyDesignPattern.Strategy;

public class AttackStrategy implements IStrategy {
    @Override
    public void action() {
        System.out.println("Attack Stragey is Applied");
    }
}
