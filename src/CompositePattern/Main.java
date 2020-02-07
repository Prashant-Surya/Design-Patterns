package CompositePattern;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Sachin");
        Player player1 = new Player("Rohit");
        Team team = new Team("Mumbai Indians");
        team.addPlayer(player);
        team.addPlayer(player1);
        Division division = new Division("IPL");
        division.addTeam(team);
        division.display();
    }
}
