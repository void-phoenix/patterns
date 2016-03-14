package patterns.singleton.singleton;


public class Singleton {

    private static Singleton singleton;

    private Singleton(){}

    public static Singleton getSingleton(){
        if (singleton == null) {
            System.out.println("У нас еще нет объекта. Создаем новый");
            singleton = new Singleton();
            return singleton;
        }
        System.out.println("Теперь у нас есть объект. Возвращаем его");
        return singleton;
    }
}
