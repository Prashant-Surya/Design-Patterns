package DecoratorPattern;

public class Encryptor extends Helper {
    public Encryptor(IMessage refMsg) {
        super(refMsg);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Encrypting the message...");
        super.sendMessage(message);
    }

}
