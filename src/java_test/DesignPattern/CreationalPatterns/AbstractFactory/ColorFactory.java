package java_test.DesignPattern.CreationalPatterns.AbstractFactory;

class Red implements AColor {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}

class Green implements AColor {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}

class Blue implements AColor {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}

public class ColorFactory extends AbstractFactory{

    @Override
    public AShape getShape(String shapeType) {
        return null;
    }

    @Override
    public AColor getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }

}
