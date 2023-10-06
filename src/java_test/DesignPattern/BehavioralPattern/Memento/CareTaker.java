package java_test.DesignPattern.BehavioralPattern.Memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private List<Memento> mementosList = new ArrayList<>();

    public void addMemento(Memento memo){
        mementosList.add(memo);
    }

    public Memento getMemento(int index){
        return mementosList.get(index);
    }

}
