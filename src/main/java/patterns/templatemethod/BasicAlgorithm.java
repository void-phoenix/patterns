package patterns.templatemethod;


public abstract class BasicAlgorithm {

    public void doWork(){
        doFirstThing();
        doSecondThing();
        doSpecialThing();
    }


    private void doFirstThing(){
        System.out.println("Первый общий шаг");
    }

    private void doSecondThing(){
        System.out.println("Второй общий шаг");
    }

    public abstract void doSpecialThing();

}
