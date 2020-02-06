package ObserverPattern.Clients;

public class StarSports extends Client {
    public StarSports(String _info) {
        super(_info);
    }

    @Override
    public void notification(String message) {
        System.out.println(_info + " received the notification " + message);
    }
}
