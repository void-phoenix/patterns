package patterns.singleton;


import patterns.singleton.singleton.Singleton;

public class Launcher {

    public static void main(String[] args) {

        final Singleton singleton = Singleton.getSingleton();
        final Singleton singleton2 = Singleton.getSingleton();
        if (singleton == singleton2) System.out.println("Обе ссылки указывают на один и тот же объект");

    }
}
