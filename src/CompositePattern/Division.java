package CompositePattern;

public class Division implements IComposite {
    String name;
    TeamList teams = new TeamList();

    public Division(String name) {
        this.name = name;
    }

    public void addTeam(Team team) {
        this.teams.addTeam(team);
    }

    @Override
    public void display() {
        System.out.println("\t\t"+name);
        teams.forEach(x -> x.display());
    }
}
