package java_test.DesignPattern.CreationalPatterns.AbstractFactory;

public abstract class AbstractFactory {
    public abstract AShape getShape(String shape);
    public abstract AColor getColor(String color);
}
