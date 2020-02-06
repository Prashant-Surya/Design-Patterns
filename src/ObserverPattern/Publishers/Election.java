package ObserverPattern.Publishers;

public class Election extends Publishers {
    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        notifyClient();
    }
    @Override
    protected String notifyInfo() {
        return "Found election news about " + message;
    }
}
