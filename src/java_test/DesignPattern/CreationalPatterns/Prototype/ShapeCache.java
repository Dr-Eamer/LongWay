package java_test.DesignPattern.CreationalPatterns.Prototype;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, ProtoShape> shapeMap = new Hashtable<>();

    public static ProtoShape getShape(String shapeId){
        ProtoShape cachedShape = shapeMap.get(shapeId);
        return (ProtoShape)cachedShape.clone();
    }

    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
