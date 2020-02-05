package FactoryMethodPattern;

public class CurrentAccount extends Account{

    @Override
    protected void actualJob() {
        System.out.println("Current job");
    }

    @Override
    protected ITax getTax() {
        ITaxFactory factory = new CurrentTaxFactory();
        return factory.getTax();
    }
}