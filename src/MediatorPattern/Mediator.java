package MediatorPattern;

import java.util.HashMap;
import java.util.Map;

public class Mediator {
    String name;
    Map<String, ClientBase> repository = new HashMap<>();

    public Mediator(String name) {
        this.name = name;
    }

    public void connect(ClientBase client) {
        System.out.println("Connnected with: " + client.id);
        repository.put(client.getId(), client);
    }

    public void disconnect(String id) {
        System.out.println("Disconnected from: " + id);
        repository.remove(id);
    }

    public void dispatch(String fromId, String toId, String message) {
        if(toId != null) {
            ClientBase client = repository.get(toId);
            client.receiveMessage(fromId, message);
        } else {
            repository.entrySet().stream().filter(x-> !x.getKey().equals(fromId)).
                    forEach(x -> x.getValue().receiveMessage(fromId, message));
        }
    }

}
