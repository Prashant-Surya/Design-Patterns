package TemplateMethodPattern;

/**
 * Bad idea to use a single class to perform to operations
 */
public class BankAccount {
    public void doSavingsJob() {
        System.out.println("Savings job done");
    }
    public void doCurrentJob() {
        System.out.println("Current job done");
    }
}
