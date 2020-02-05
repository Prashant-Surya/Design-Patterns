package FactoryMethodPattern;

public class CurrentTax implements ITax {
    @Override
    public void calculate() {
        System.out.println("Current tax calculated");
    }
}
