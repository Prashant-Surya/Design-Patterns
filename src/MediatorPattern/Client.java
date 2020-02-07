package MediatorPattern;

public class Client extends ClientBase {

    public Client(String id, Mediator mediator) {
        super(id, mediator);
    }

    @Override
    public void sendMessage(String toId, String message) {
        this.mediator.dispatch(this.id, toId, message);
    }

    @Override
    public void receiveMessage(String fromId, String message) {
        System.out.println("ID: " + this.id + " Received " + message + " from: " + fromId);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                '}';
    }
}
