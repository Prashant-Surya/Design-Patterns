package StatePattern;

public class Account {
    int amount;
    CardType cardType;

    public Account(int amount) {
        super();
        this.amount = amount;
        init();
    }

    void init() {
        String key = KeyGenerator.getKey(this.amount);
        this.cardType = CardPool.Repository.getInstance(key);
    }

    public int getAmount() {
        return amount;
    }

    public void debit(int amount) {
        this.amount -= amount;
        init();
        displayDetails();
    }

    public void credit(int amount) {
        this.amount += amount;
        init();
        displayDetails();
    }

    public void displayDetails() {
        System.out.println("-------------------------------");
        System.out.println("Balance is " + getAmount() + "\nCard Type: " + cardType.key);
        System.out.println("Card Fees is " + cardType.getFees());
        System.out.println("-------------------------------");
    }

}
