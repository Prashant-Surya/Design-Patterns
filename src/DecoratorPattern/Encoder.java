package DecoratorPattern;

public class Encoder extends Helper {
    public Encoder(IMessage refMsg) {
        super(refMsg);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Encoding the message...");
        super.sendMessage(message);
    }

}
