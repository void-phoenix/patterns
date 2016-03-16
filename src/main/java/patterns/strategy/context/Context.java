package patterns.strategy.context;


import patterns.strategy.choice.Choice;

public class Context {
    Choice choice;

    public void setChoice(Choice choice) {
        this.choice = choice;
    }

    public void showChoice(String s1, String s2){
        choice.choose(s1, s2);
    }
}
