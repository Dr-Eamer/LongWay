package java_test.DesignPattern.CreationalPatterns.Builder;

public class Cola extends CoolDrink{
    @Override
    public String name() {
        return "cola";
    }

    @Override
    public float price() {
        return 2.0f;
    }
}
