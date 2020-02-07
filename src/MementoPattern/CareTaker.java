package MementoPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Ideally setMemento, getMemento objects deal with multiple repositories
 */
public class CareTaker {

    ObjectRepository repository = new ObjectRepository();
    public void setMemento(Integer key, Map<String, Object> value) {
        repository.store(key, value);
    }
    public Map<String, Object> getMemento(Integer key) {
        return repository.retrieve(key);
    }
}
