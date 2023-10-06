package java_test.DesignPattern.StructuralPatterns.Bridge;

public abstract class BridgeShape{
    protected DrawApi drawApi;

    protected BridgeShape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
