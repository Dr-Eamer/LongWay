package java_test.DesignPattern.BehavioralPatterns.State;

/**
 * 状态类，状态模式核心类
 */
public class Context {
    private State state;

    public Context() {
        this.state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
