package java_test.DesignPattern.StructuralPatterns.Facade;

public class FacadeRectangle implements FacadeShape{
    @Override
    public void draw() {
        System.out.println("drawing:Rectangle");
    }
}
