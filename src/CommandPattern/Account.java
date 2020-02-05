package CommandPattern;

public class Account {
    int balance;

    public Account(int balance) {
        super();
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void doDebit(int amount) {
        this.balance -= amount;
    }

    public void doCredit(int amount) {
        this.balance += amount;
    }

}
