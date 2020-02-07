package MementoPattern;

import java.util.HashMap;
import java.util.Map;

public class Customer extends CPersist {
    int id;
    String name;
    String type;
    boolean isActive;

    public Customer(int id, String name, String type, boolean isActive) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.isActive = isActive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", isActive=" + isActive +
                '}';
    }

    @Override
    protected Map<String, Object> storeState() {
        Map<String, Object> value = new HashMap<>();
        value.put("id", this.id);
        value.put("name", this.name);
        value.put("type", this.type);
        value.put("isActive", this.isActive);
        return value;
    }

    @Override
    protected void getState(Map<String, Object> value) {
        id = (Integer) value.get("id");
        name = (String) value.get("name");
        type = (String) value.get("type");
        isActive = (Boolean) value.get("isActive");

    }
}
