package FactoryMethodPattern;

public class SavingTaxFactory implements ITaxFactory {
    @Override
    public ITax getTax() {
        return new SavingTax();
    }
}
