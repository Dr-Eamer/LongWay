package java_test.DesignPattern.BehavioralPattern.Observer;

public class HexaObserver extends Observer{

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String:" +
                Integer.toHexString(subject.getState())
        );
    }
}
