package bridge;

// Crear la clase Abstraction que mantiene una referencia a un objeto de tipo Implementor

public abstract class Abstraction {

    protected Implementor implementor;

    protected Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    // Método abstracto que las subclases deben implementar
    public abstract void operation();

}
