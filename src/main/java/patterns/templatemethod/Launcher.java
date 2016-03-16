package patterns.templatemethod;


public class Launcher {
    public static void main(String[] args) {
        BasicAlgorithm algorithm = new ConcreteAlgjrithm1();
        algorithm.doWork();

        System.out.println("------------------------");

        algorithm = new ConcreteAlgorithm2();
        algorithm.doWork();

    }
}
