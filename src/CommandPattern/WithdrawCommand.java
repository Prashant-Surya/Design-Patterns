package CommandPattern;

public class WithdrawCommand extends Command {

    public WithdrawCommand(int state) {
        super(state);
    }

    @Override
    public void execute(Account account) {
        account.doDebit(state);
    }

    @Override
    public void unExecute(Account account) {
        account.doCredit(state);
    }
}
