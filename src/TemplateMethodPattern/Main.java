package TemplateMethodPattern;

public class Main {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.doJob();
        System.out.println("-------------------");
        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.doJob();
    }
}
