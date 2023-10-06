package java_test.DesignPattern.CreationalPatterns.Prototype;

public class Rectangle extends ProtoShape {
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
