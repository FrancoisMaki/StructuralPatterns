package decorator;

// Crear la clase Decorator que mantiene una referencia a un objeto de tipo Component

public abstract class Decorator implements Component{

    protected Component component;

    protected Decorator(Component component) {
        this.component = component;
    }

    // Método abstracto que las subclases deben implementar
    public abstract void operation();
}
