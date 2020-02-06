package ObserverPattern.Observers;

public class CricketObserver extends Observer {

    @Override
    protected String getObserverMessage() {
        return "Cricket";
    }
}
