package java_test.DesignPattern.BehavioralPatterns.Command;

public class SellStock implements Order{
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
