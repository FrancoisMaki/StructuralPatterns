package bridge;

// Crear las clases ConcreteImplementor que implementan la operación definida en Implementor


public class ConcreteImplementorA implements Implementor {

    @Override
    public void operationImpl() {
        // Implementación específica de la operación en ConcreteImplementorB
        System.out.println("ConcreteImplementorA operationImpl() called.");
    }

}
