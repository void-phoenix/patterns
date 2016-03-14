package patterns.observer.subject;


import patterns.observer.observer.Observer;

interface Subject {
    void register(Observer simpleObserver);
    void unregister(Observer simpleObserver);
    void notifyObservers(int newValue);
}