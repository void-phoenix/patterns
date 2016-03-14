package patterns.observer.subject;

import patterns.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;


public class SimpleSubject implements Subject {

    List<Observer> simpleObservers = new ArrayList<>();
    private int flag;

    @Override
    public void register(Observer simpleObserver) {
        simpleObservers.add(simpleObserver);
    }

    @Override
    public void unregister(Observer simpleObserver) {
        simpleObservers.remove(simpleObserver);
    }

    @Override
    public void notifyObservers(int newValue) {
        simpleObservers.forEach(observer -> observer.update(newValue));
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
        notifyObservers(flag);
    }
}