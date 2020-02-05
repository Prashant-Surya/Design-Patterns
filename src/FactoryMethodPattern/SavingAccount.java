package FactoryMethodPattern;

public class SavingAccount extends Account {

    @Override
    protected ITax getTax() {
        ITaxFactory factory = new SavingTaxFactory();
        return factory.getTax();
    }

    @Override
    protected void actualJob() {
        System.out.println("Savings job done");
    }
}