package java_test.DesignPattern.BehavioralPatterns.Visitor;

public class Mouse implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
