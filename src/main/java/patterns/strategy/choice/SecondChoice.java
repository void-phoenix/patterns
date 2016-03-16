package patterns.strategy.choice;


public class SecondChoice implements Choice{

    @Override
    public void choose(String choice1, String choice2) {
        System.out.println("Склеиваем две строки с пробелом");
        System.out.println(choice1 + " " + choice2);
    }
}
