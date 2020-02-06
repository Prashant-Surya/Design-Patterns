package ObserverPattern.Publishers;

public class Entertainment extends Publishers {
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
        return "Found entertainment news about " + message;
    }
}
