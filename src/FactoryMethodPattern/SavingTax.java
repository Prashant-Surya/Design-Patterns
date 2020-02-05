package FactoryMethodPattern;

public class SavingTax implements ITax {

    @Override
    public void calculate() {
        System.out.println("Saving tax calculated");
    }
}
