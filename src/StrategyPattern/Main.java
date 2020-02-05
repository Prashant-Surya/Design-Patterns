package StrategyPattern;

public class Main {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.setDb(new SQLServer());
        savingAccount.doJob();
        System.out.println("-------------------------");
        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.setDb(new OracleServer());
        currentAccount.doJob();
    }
}
