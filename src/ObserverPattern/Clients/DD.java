package ObserverPattern.Clients;

public class DD extends Client {
    public DD(String _info) {
        super(_info);
    }

    @Override
    public void notification(String message) {
        System.out.println(_info + " received the notification " + message);
    }
}
