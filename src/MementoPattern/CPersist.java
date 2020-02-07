package MementoPattern;

import java.util.Map;

public abstract class CPersist {
    CareTaker careTaker;

    public void setCareTaker(CareTaker careTaker) {
        this.careTaker = careTaker;
    }

    public void hydrate() {
        Map<String, Object> value = storeState();
        careTaker.setMemento(this.hashCode(), value);
    }

    public void dehydrate() {
        Map<String, Object> value = careTaker.getMemento(this.hashCode());
        getState(value);
    }

    protected abstract Map<String, Object> storeState();
    protected abstract void getState(Map<String, Object> value);
}
