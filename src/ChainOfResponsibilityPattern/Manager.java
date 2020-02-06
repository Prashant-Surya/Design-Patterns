package ChainOfResponsibilityPattern;

public class Manager extends Approver {


    public Manager(String name) {
        super(name);
    }

    @Override
    public void processLoan(int amount) {
        if (amount <= 500000) {
            System.out.println("Manager " + _name + " Processed loan of " + amount);
        } else {
            System.out.println("Manager " + _name + " Cannot process loan of " + amount);
            this.goToSuccessor(amount);
        }
    }
}
