package java_test.DesignPattern.BehavioralPattern.Visitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
