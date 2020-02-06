package ChainOfResponsibilityPattern;

public class Director extends Approver {
    public Director(String name) {
        super(name);
    }

    @Override
    public void processLoan(int amount) {
        if (amount <= 700000) {
            System.out.println("Director " + _name + " Processed loan of " + amount);
        } else {
            System.out.println("Director " + _name + " Cannot process loan of " + amount);
            this.goToSuccessor(amount);
        }
    }
}
