package StatePattern;

public class Main {

    static {
        Dummy dummy = new Dummy();
        // It gets added into the pool because of the CardType constructor
        new Platinum(dummy, "Test Platinum Card");
        new Gold(dummy, "Test Gold Card");
        new Silver(dummy, "Test Silver Card");
    }

    public static void main(String[] args) {
        Account account = new Account(550000);
        account.displayDetails();
        account.debit(100000);
        account.debit(200000);
    }
}
