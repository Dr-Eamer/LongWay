package java_test.DesignPattern.StructuralPatterns.Facade;

public class FacadeSquare implements FacadeShape{

    @Override
    public void draw() {
        System.out.println("drawing:Square");
    }
}
