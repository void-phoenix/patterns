package patterns.decorator;

import patterns.decorator.component.ConcreteComponent;
import patterns.decorator.decorator.DecoratorImpl1;
import patterns.decorator.decorator.DecoratorImpl2;

public class Launcher {

    public static void main(String[] args) {

        ConcreteComponent concreteComponent = new ConcreteComponent();
        DecoratorImpl1 decoratorImpl1 = new DecoratorImpl1();
        decoratorImpl1.setComponent(concreteComponent);
        decoratorImpl1.doJob();

        System.out.println("----------------------");

        DecoratorImpl2 decoratorImpl2 = new DecoratorImpl2();
        decoratorImpl2.setComponent(concreteComponent);
        decoratorImpl2.doJob();


    }
}
