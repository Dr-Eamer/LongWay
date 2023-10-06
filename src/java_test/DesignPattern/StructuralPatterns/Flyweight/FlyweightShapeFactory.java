package java_test.DesignPattern.StructuralPatterns.Flyweight;

import java.util.HashMap;

public class FlyweightShapeFactory {

    private final static HashMap<String,FlyweightShape> circleMap = new HashMap<>();

    public static FlyweightShape getCircle(String color){
        FlyweightCircle circle = (FlyweightCircle) circleMap.get(color);
        if (circle == null) {
            circle = new FlyweightCircle(color);
            circleMap.put(color,circle);
            System.out.println("Create circle of color: " + color);
        }
        return circle;
    }
}
