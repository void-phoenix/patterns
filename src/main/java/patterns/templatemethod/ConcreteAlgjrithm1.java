package patterns.templatemethod;


public class ConcreteAlgjrithm1 extends BasicAlgorithm{

    @Override
    public void doSpecialThing() {
        System.out.println("Специальная реализация из класса " + this.getClass().getName());
    }
}
