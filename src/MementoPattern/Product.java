package MementoPattern;

import java.util.HashMap;
import java.util.Map;

public class Product extends CPersist {

    int id;
    String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    protected Map<String, Object> storeState() {
        Map<String, Object> value = new HashMap<>();
        value.put("id", this.id);
        value.put("name", this.name);
        return value;
    }

    @Override
    protected void getState(Map<String, Object> value) {
        id = (Integer) value.get("id");
        name = (String) value.get("name");
    }

}
