package CompositePattern;

public class Team implements IComposite {
    String name;

    PlayersList players = new PlayersList();

    public Team(String name) {
        this.name = name;
    }

    public void addPlayer(Player player) {
        this.players.addPlayer(player);
    }

    @Override
    public void display() {
        System.out.println("\t\t\t" + name);
        players.display();
    }
}
