package decorator;

public class ConcreteDecorator extends Decorator{

        public ConcreteDecorator(Component component) {
            super(component);
        }

        private void addedBehavior() {
            // Comportamiento adicional de ConcreteDecorator
            System.out.println("ConcreteDecorator's addedBehavior()");
        }

        @Override
        public void operation() {
            // Llama a la operación del componente y añade una funcionalidad adicional
            component.operation();
            addedBehavior();
        }

}
