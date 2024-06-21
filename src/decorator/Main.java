package decorator;

public class Main {

    public static void main(String[] args) {

        // Crear un objeto ConcreteComponent
        Component component = new ConcreteComponent();

        // Crear un objeto ConcreteDecorator y pasarle el objeto ConcreteComponent
        Decorator decorator = new ConcreteDecorator(component);

        // Llamar a la operación del objeto ConcreteDecorator
        decorator.operation();

    }

}
