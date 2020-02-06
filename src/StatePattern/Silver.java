package StatePattern;

public class Silver extends CardType {
    double tax, cess, minFees;
    protected Silver(Dummy dummy, String name) {
        super(dummy, name, "Silver");
        tax = 11.0;
        cess = 12.0;
        minFees = 12.0;

    }

    protected Silver(Silver par) {
        super(par);
        tax = par.tax;
        cess = par.cess;
        minFees = par.minFees;
    }

    @Override
    public double getFees() {
        return minFees + tax + cess;
    }

    @Override
    public CardType clone() {
        return new Silver(this);
    }
}
