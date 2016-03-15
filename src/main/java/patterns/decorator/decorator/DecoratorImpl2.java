package patterns.decorator.decorator;


public class DecoratorImpl2 extends AbstractDecorator{

    @Override
    public void doJob() {
        super.doJob();
        System.out.println("Расшинрение функциональности через " + this.getClass().getName());
    }
}
