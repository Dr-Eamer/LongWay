package java_test.DesignPattern.StructuralPatterns.Facade;

public class FacadeCircle implements FacadeShape{
    @Override
    public void draw() {
        System.out.println("drawing:Circle");
    }
}
