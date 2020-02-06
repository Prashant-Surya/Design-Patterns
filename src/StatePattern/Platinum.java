package StatePattern;

public class Platinum extends CardType {
    double fees;
    protected Platinum(Dummy dummy, String name) {
        super(dummy, name, "Platinum");
        fees = 99.00; // Fetched from outside;
    }

    protected Platinum(CardType par) {
        super(par);
        this.fees = par.getFees();
    }

    @Override
    public double getFees() {
        return fees;
    }

    @Override
    public CardType clone() {
        return new Platinum(this);
    }
}
