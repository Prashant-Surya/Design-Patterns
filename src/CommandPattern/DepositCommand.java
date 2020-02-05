package CommandPattern;

public class DepositCommand extends Command {

    public DepositCommand(int state) {
        super(state);
    }

    @Override
    public void execute(Account account) {
        account.doCredit(state);
    }

    @Override
    public void unExecute(Account account) {
        account.doDebit(state);
    }
}
