package java_test.DesignPattern.StructuralPatterns.Decorator;

public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(DecoratorShape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setRedBorder(shape);
    }

    private void setRedBorder(DecoratorShape shape){
        System.out.println("Border Color: Red");
    }
}
