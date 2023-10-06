package java_test.DesignPattern.CreationalPatterns.Builder;

public class Pepsi extends CoolDrink{
    @Override
    public String name() {
        return "pepsi";
    }

    @Override
    public float price() {
        return 2.5f;
    }
}
