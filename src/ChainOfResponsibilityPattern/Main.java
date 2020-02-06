package ChainOfResponsibilityPattern;

public class Main {
    public static void main(String[] args) {
        Cashier cashier = new Cashier("Rajan");
        Manager manager = new Manager("Shiva");
        Director director = new Director("Parth");

        cashier.setSuccessor(manager);
        manager.setSuccessor(director);

        cashier.processLoan(300000);

    }
}
