package decorator;

// Crear la clase ConcreteComponent que implementa la operación definida en Component

public class ConcreteComponent implements Component{

        @Override
        public void operation() {
            // Implementación específica de la operación en ConcreteComponent
            System.out.println("ConcreteComponent operation() called.");
        }

}
