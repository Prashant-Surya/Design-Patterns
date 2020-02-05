package CommandPattern;

public class Main {

    public static void main(String[] args){
        Account account = new Account(5000);
        TransactionHelper transactionHelper = new TransactionHelper(account);

        transactionHelper.deposit(1000);
        transactionHelper.deposit(2000);
        transactionHelper.deposit(3000);

        transactionHelper.undo();
        transactionHelper.undo();
        transactionHelper.undo();

        System.out.println("Balance is "+ account.getBalance());
    }
}
