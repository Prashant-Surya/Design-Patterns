package PrototypePattern;

public abstract class CardType {
    protected String cardName;
    protected String key;

    protected CardType(Dummy dummy, String name, String key) {
        // Registration of the objects into the pool.
        // Added Dummy to overload this function to use this object to add into pool.
        this.cardName = name;
        this.key = key;
        CardPool.Repository.poolInstance(key, this);
    }
    protected CardType(CardType par) {
        // State that needs to be copied in case of cloning;
        cardName = par.cardName;
        key = par.key;
    }

    public CardType(String cardName) {
        this.cardName = cardName;
    }

    public void displayCardInfo() {
        System.out.println("--------------" + cardName + "------------------");
        System.out.println("Fees: " +getFees());
        System.out.println("--------------------------------");
    }
    public abstract double getFees();
    public abstract CardType clone();

}
