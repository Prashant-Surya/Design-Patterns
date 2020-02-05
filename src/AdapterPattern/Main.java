package AdapterPattern;

public class Main {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.setDb(new SQLServer());
        savingAccount.doJob();
        System.out.println("-------------------------");
        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.setDb(new IConnectWrapper(new IConnectDB1()));
        currentAccount.doJob();
    }
}
