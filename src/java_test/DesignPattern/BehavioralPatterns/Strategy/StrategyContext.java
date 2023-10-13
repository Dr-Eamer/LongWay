package java_test.DesignPattern.BehavioralPatterns.Strategy;

public class StrategyContext {
    private Strategy strategy;

    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeOperation(int num1,int num2){
        return strategy.doOperation(num1, num2);
    }
}
