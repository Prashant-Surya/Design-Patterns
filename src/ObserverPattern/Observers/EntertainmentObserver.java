package ObserverPattern.Observers;

public class EntertainmentObserver extends Observer {
    @Override
    protected String getObserverMessage() {
        return "Entertainment";
    }
}
