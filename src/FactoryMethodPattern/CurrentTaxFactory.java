package FactoryMethodPattern;

public class CurrentTaxFactory implements ITaxFactory {
    @Override
    public ITax getTax() {
        return new CurrentTax();
    }
}
