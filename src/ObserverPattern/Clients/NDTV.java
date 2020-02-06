package ObserverPattern.Clients;

public class NDTV extends Client {
    public NDTV(String _info) {
        super(_info);
    }

    @Override
    public void notification(String message) {
        System.out.println(_info + " received the notification " + message);
    }
}
