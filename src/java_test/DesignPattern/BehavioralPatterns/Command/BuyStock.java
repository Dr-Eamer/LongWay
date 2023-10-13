package java_test.DesignPattern.BehavioralPatterns.Command;

public class BuyStock implements Order{
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
