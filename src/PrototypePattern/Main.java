package PrototypePattern;

public class Main {

    static {
        Dummy dummy = new Dummy();
        // It gets added into the pool because of the CardType constructor
        new Platinum(dummy, "Test Platinum Card");
        new Gold(dummy, "Test Gold Card");
    }

    public static void main(String[] args) {
        CardType card = CardPool.Repository.getInstance("Platinum");
        card.displayCardInfo();
    }
}
