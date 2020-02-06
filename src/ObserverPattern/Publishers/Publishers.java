package ObserverPattern.Publishers;

import ObserverPattern.Observers.Observer;

public abstract class Publishers {

    public Observer getObserver() {
        return observer;
    }

    public void setObserver(Observer observer) {
        this.observer = observer;
    }

    protected Observer observer;
    protected abstract String notifyInfo();

    public void notifyClient() {
        String message = notifyInfo();
        this.observer.dispatch(message);
    }

}
