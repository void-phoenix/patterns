package patterns.proxy.proxy;


import patterns.proxy.original.ConcreteSubject;
import patterns.proxy.original.Subject;

public class Proxy extends Subject{

    ConcreteSubject subject;

    @Override
    public void doSomething() {
        System.out.println("Вызывается прокси");
        if (subject == null) subject = new ConcreteSubject();
        subject.doSomething();
    }
}
