package java_test.DesignPattern.BehavioralPatterns.Visitor;

public class Computer implements ComputerPart{

    ComputerPart[] parts;

    public Computer() {
        this.parts = new ComputerPart[]{ new Monitor(),new Mouse(),new KeyBoard() };
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }

}
