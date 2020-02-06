package StatePattern;

public class Gold extends CardType {
    double tax, cess, minFees;
    protected Gold(Dummy dummy, String name) {
        super(dummy, name, "Gold");
        tax = 10.0;
        cess = 2.0;
        minFees = 10.0;

    }

    protected Gold(Gold par) {
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
        return new Gold(this);
    }
}
