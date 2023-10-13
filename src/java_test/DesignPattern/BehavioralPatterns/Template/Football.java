package java_test.DesignPattern.BehavioralPatterns.Template;

public class Football extends Game{
    @Override
    void initialize() {
        System.out.println("Football game init");
    }

    @Override
    void startGame() {
        System.out.println("Football game start");
    }

    @Override
    void endGame() {
        System.out.println("Football game end");
    }
}
