package MementoPattern;

import java.util.HashMap;
import java.util.Map;

public class ObjectRepository {
    /*
    Instead of Map as the value we can use list to store list of states of the objects
     */
    Map<Integer, Map<String, Object>> repository = new HashMap<>();
    public void store(Integer key, Map<String, Object> value) {
        repository.put(key, value);
    }
    public Map<String, Object> retrieve(Integer key) {
        return repository.remove(key);
    }
}
