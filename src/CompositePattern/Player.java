package CompositePattern;

public class Player implements IComposite {
    String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("\t\t\t\t" + name);
    }
}
