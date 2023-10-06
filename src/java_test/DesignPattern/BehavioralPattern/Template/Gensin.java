package java_test.DesignPattern.BehavioralPattern.Template;

public class Gensin extends Game{
    @Override
    void initialize() {
        System.out.println("Gensin game init");
    }

    @Override
    void startGame() {
        System.out.println("Gensin game start");
    }

    @Override
    void endGame() {
        System.out.println("Gensin game end");
    }
}
