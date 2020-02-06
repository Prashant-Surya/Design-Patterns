package FacadePattern;

public class HomeLoan extends Facade {
    @Override
    protected void initialCriterias() {
        addCriteria(new AccountStatus());
        addCriteria(new TransactionInfo());
    }
}
