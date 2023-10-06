package java_test.DesignPattern.CreationalPatterns.Builder;

public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "chicken burger";
    }

    @Override
    public float price() {
        return 3.0f;
    }
}
