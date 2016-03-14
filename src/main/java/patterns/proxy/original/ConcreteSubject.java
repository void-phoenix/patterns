package patterns.proxy.original;


public class ConcreteSubject extends Subject{

    @Override
    public void doSomething() {
        System.out.println("Делаем что-то конкретное");
    }
}
