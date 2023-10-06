package java_test.DesignPattern.CreationalPatterns.Prototype;

public class Square extends ProtoShape {
    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
