package patterns.strategy.choice;


public class FirstChoice implements Choice{

    @Override
    public void choose(String choice1, String choice2) {
        System.out.println("тут мы складываем числа");
        final int firstNumber = Integer.valueOf(choice1);
        final int secondNumber = Integer.valueOf(choice2);
        System.out.println("Сумма = " + (firstNumber + secondNumber));
    }
}
