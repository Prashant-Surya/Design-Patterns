package DecoratorPattern;

public class Helper implements IMessage {
    IMessage refMsg;

    public Helper(IMessage refMsg) {
        this.refMsg = refMsg;
    }

    @Override
    public void sendMessage(String message) {
        this.refMsg.sendMessage(message);
    }
}
