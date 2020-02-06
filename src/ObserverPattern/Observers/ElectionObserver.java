package ObserverPattern.Observers;

public class ElectionObserver extends Observer {
    @Override
    protected String getObserverMessage() {
        return "Election";
    }
}
