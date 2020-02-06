package ObserverPattern.Observers;

import ObserverPattern.Clients.Client;

import java.util.ArrayList;
import java.util.List;

public abstract class Observer {
    List<Client> clients;

    public Observer() {
        this.clients = new ArrayList<>();
    }

    public void subscribe(Client client) {
        clients.add(client);
    }

    protected abstract String getObserverMessage();
    public void dispatch(String message) {
        System.out.println("Sending notifications for " + getObserverMessage());
        clients.forEach(client -> client.notification(message));
    }

}
