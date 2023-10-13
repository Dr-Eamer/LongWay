package java_test.DesignPattern.BehavioralPatterns.Visitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
