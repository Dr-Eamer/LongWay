package java_test.DesignPattern.BehavioralPatterns.Visitor;

public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Monitor monitor);
    void visit(Mouse mouse);
    void visit(KeyBoard keyBoard);
}
