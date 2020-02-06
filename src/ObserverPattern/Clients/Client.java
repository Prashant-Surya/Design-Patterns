package ObserverPattern.Clients;

public abstract class Client {
    protected String _info;

    public Client(String _info) {
        this._info = _info;
    }

    public abstract void notification(String message);

}
