package java_test.DesignPattern.StructuralPatterns.Decorator;

public class DecoratorCircle implements DecoratorShape{
    @Override
    public void draw() {
        System.out.println("Shape:Circle");
    }
}
