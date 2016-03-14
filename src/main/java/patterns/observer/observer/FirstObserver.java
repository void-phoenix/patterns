package patterns.observer.observer;

public class FirstObserver implements Observer {

    public void update(int newValue) {
        System.out.println("Флаг в на наблюдателе " + this.getClass().getName() + " изменился на " + newValue);
    }
}
