package patterns.observer;


import patterns.observer.observer.FirstObserver;
import patterns.observer.observer.SecondObserver;
import patterns.observer.subject.SimpleSubject;


public class Launcher {

    public static void main(String[] args) {

        FirstObserver firstObserver = new FirstObserver();
        SecondObserver secondObserver = new SecondObserver();
        SimpleSubject simpleSubject = new SimpleSubject();
        simpleSubject.register(firstObserver);
        simpleSubject.register(secondObserver);

        System.out.println("Сейчас мы увидим изменения из двух наблюдателей");
        simpleSubject.setFlag(10);
        simpleSubject.unregister(firstObserver);

        System.out.println("\nИз одного");
        simpleSubject.setFlag(20);
        simpleSubject.unregister(secondObserver);
        System.out.println("\nПоследнего изменения мы не увилим");
        simpleSubject.setFlag(30);

    }
}
