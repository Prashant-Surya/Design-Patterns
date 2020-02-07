package CompositePattern;

import java.util.ArrayList;

public class PlayersList extends ArrayList<Player> implements IComposite{

    public void addPlayer(Player player) {
        this.add(player);
    }

    @Override
    public void display() {
        this.forEach(x -> x.display());
    }
}
