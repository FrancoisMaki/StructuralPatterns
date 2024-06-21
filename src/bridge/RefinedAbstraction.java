package bridge;

// Crear la clase RefinedAbstraction que extiende Abstraction y implementa el método operation

public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        // Llama a la operación del implementor
        implementor.operationImpl();
    }

}
