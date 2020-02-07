package MediatorPattern;

public abstract class ClientBase {
    protected String id;

    protected Mediator mediator;

    public ClientBase(String id, Mediator mediator) {
        super();
        this.id = id;
        this.mediator = mediator;
    }

    public abstract void sendMessage(String toId, String message);

    public abstract void receiveMessage(String fromId, String message);

    public void connect() {
        mediator.connect(this);
    }
    public void disconnect() {
        mediator.disconnect(this.id);
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getId() {
        return id;
    }

}
