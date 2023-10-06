package java_test.DesignPattern.StructuralPatterns.Bridge;

public class BridgeCircle extends BridgeShape{
    private int x,y,radius;

    public BridgeCircle(int x,int y,int radius,DrawApi drawApi) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(radius,x,y);
    }

}
