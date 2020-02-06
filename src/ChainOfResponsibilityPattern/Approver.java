package ChainOfResponsibilityPattern;

public abstract class Approver {
    Approver _successor;
    String _name;

    public Approver(String name) {
        this._name = name;
        this._successor = null;
    }

    public void setSuccessor(Approver _successor) {
        this._successor = _successor;
    }

    public abstract void processLoan(int amount);

    protected void goToSuccessor(int amount) {
        if (_successor != null) {
            this._successor.processLoan(amount);
        }
    }

}
