package ChainOfResponsibilityPattern;

public class Cashier extends Approver {
    public Cashier(String name) {
        super(name);
    }

    @Override
    public void processLoan(int amount) {
        if (amount <= 200000) {
            System.out.println("Cashier " + _name + " Processed loan of " + amount);
        } else {
            System.out.println("Cashier " + _name + " Cannot process loan of " + amount);
            this.goToSuccessor(amount);
        }
    }
}
