package patterns.decorator.component;


public class ConcreteComponent extends Component{

    @Override
    public void doJob() {
        System.out.println("Конкретная реализация, закрытая для изменения");
    }
}
