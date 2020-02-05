package CommandPattern;

public abstract class Command {
    protected int state;
    public Command(int state) {
        this.state = state;
    }

    public abstract void execute(Account account);
    public abstract void unExecute(Account account);
}
