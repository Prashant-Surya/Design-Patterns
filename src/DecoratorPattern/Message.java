package DecoratorPattern;

public class Message extends Helper {
    public Message(IMessage refMsg) {
        super(refMsg);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Message sent: " + message);
        super.sendMessage(message);
    }
}
