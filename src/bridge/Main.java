package bridge;

public class Main {

    public static void main(String[] args) {

        // Crear un objeto ConcreteImplementorA
        Implementor implementorA = new ConcreteImplementorA();

        // Crear un objeto RefinedAbstraction y pasarle el objeto ConcreteImplementorA
        Abstraction abstractionA = new RefinedAbstraction(implementorA);

        // Llamar a la operación del objeto RefinedAbstraction
        abstractionA.operation();

        // Crear un objeto ConcreteImplementorB
        Implementor implementorB = new ConcreteImplementorB();

        // Crear un objeto RefinedAbstraction y pasarle el objeto ConcreteImplementorB
        Abstraction abstractionB = new RefinedAbstraction(implementorB);

        // Llamar a la operación del objeto RefinedAbstraction
        abstractionB.operation();

    }

}
