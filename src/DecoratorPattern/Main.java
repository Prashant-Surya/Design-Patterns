package DecoratorPattern;

public class Main {
    public static void main(String[] args){
        System.out.println("--------------------------");
        IMessage msg = MessageFactory.Factory.getMessageObject();
        msg.sendMessage("Test");

        System.out.println("--------------------------");
    }
}