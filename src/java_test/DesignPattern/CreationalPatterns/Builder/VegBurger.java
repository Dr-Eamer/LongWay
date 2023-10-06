package java_test.DesignPattern.CreationalPatterns.Builder;

public class VegBurger extends Burger{
    @Override
    public String name() {
        return "veg burger";
    }

    @Override
    public float price() {
        return 2.5f;
    }
}
