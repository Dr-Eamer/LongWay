package java_test.DesignPattern.CreationalPatterns.Prototype;

public class Circle extends ProtoShape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
