package java_test.DesignPattern.StructuralPatterns.Decorator;

public abstract class ShapeDecorator implements DecoratorShape{
    protected DecoratorShape shape;

    public ShapeDecorator(DecoratorShape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
