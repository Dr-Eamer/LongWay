package java_test.DesignPattern.StructuralPatterns.Facade;

import java_test.DesignPattern.CreationalPatterns.Factory.Shape;

public class ShapeMaker {
    private FacadeShape circle;
    private FacadeShape square;
    private FacadeShape rectangle;

    public ShapeMaker() {
        this.circle = new FacadeCircle();
        this.square = new FacadeSquare();
        this.rectangle = new FacadeRectangle();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawSquare(){
        square.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }
}
