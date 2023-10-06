package java_test.DesignPattern.BehavioralPattern.Visitor;

public class KeyBoard implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
