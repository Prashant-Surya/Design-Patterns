package DecoratorPattern;

public class MessageFactory {
    public static class Factory {
        public static IMessage getMessageObject() {
            return new Encryptor(new Encoder(new Message(new NullMessage())));
        }
    }
}
