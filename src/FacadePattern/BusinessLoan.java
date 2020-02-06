package FacadePattern;

public class BusinessLoan extends Facade {

    @Override
    public void initialCriterias() {
        addCriteria(new AccountStatus());
        addCriteria(new TransactionInfo());
        addCriteria(new AccountsInfo());
    }

}
