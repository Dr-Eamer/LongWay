package java_test.DesignPattern.StructuralPatterns.Bridge;

public class GreenCircle implements DrawApi{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println(
            "Drawing Circle[ color:green radius:" + radius
            + " x:" + x
            + " y:" + y
            + " ]"
        );
    }
}
