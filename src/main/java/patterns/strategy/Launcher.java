package patterns.strategy;


import patterns.strategy.choice.FirstChoice;
import patterns.strategy.choice.SecondChoice;
import patterns.strategy.context.Context;

public class Launcher {
    public static void main(String[] args) {

        final String firstParameter = "12";
        final String secondParameter = "22";

        final Context context = new Context();
        FirstChoice firstChoice = new FirstChoice();
        SecondChoice secondChoice = new SecondChoice();
        System.out.println("Первая реализация");
        context.setChoice(firstChoice);
        context.showChoice(firstParameter, secondParameter);
        System.out.println("\nВторая реализация");
        context.setChoice(secondChoice);
        context.showChoice(firstParameter, secondParameter);
    }
}
