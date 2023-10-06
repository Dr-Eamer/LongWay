package java_test.DesignPattern.StructuralPatterns.Decorator;

public class DecoratorRectangle implements DecoratorShape{
    @Override
    public void draw() {
        System.out.println("Shape:Rectangle");
    }
}
