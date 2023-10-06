package java_test.DesignPattern.StructuralPatterns.Proxy;

public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    @Override
    public void display() {
        System.out.println("displaying file: " + fileName);
    }

    private void loadFromDisk(){
        System.out.println("loading file: " + fileName);
    }
}
