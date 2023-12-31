package java_test.DesignPattern.BehavioralPatterns.Visitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor{
    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse");
    }

    @Override
    public void visit(KeyBoard keyBoard) {
        System.out.println("Displaying Keyboard");
    }
}
