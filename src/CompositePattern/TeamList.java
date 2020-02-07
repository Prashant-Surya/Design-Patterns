package CompositePattern;

import java.util.ArrayList;

public class TeamList extends ArrayList<Team> implements IComposite{

    public void addTeam(Team team) {
        this.add(team);
    }

    @Override
    public void display() {
        System.out.println("Teams in the list are: ");
        this.forEach(x -> x.display());
    }
}