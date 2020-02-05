package CommandPattern;

public class TransactionHelper {
    Account account;
    CommandRepository repository;


    public TransactionHelper(Account account) {
        this.account = account;
        this.repository = new CommandRepository();
    }

    public void deposit(int amount) {
        Command command = new DepositCommand(amount);
        this.repository.storeCommand(command);
        command.execute(this.account);
        System.out.println("Balance after credit " + account.getBalance());
    }

    public void withdraw(int amount) {
        Command command = new WithdrawCommand(amount);
        this.repository.storeCommand(command);
        command.execute(this.account);
        System.out.println("Balance after debit " + account.getBalance());
    }

    public void undo() {
        Command command = this.repository.retrieveCommand();
        command.unExecute(this.account);
        System.out.println("Balance after undo " + account.getBalance());
    }

}
