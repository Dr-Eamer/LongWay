package java_test.DesignPattern.BehavioralPatterns.Memento;

public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memo){
        state = memo.getState();
    }
}
