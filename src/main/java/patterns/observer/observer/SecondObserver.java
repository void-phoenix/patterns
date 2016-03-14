package patterns.observer.observer;


public class SecondObserver implements Observer{

    @Override
    public void update(int newValue) {
        System.out.println("Флаг в на наблюдателе " + this.getClass().getName() + " изменился на " + newValue);
    }
}
