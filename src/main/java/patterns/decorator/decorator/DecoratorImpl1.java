package patterns.decorator.decorator;

public class DecoratorImpl1 extends AbstractDecorator{

    @Override
    public void doJob() {
        super.doJob();
        System.out.println("Расшинрение функциональности через " + this.getClass().getName());
    }
}
