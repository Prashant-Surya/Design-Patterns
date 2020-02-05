package TestPattern;

public class IConnectDB1 implements IConnect {
    @Override
    public void connect() {
        System.out.println("Connected IConnectDB1");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected IConnectDB1");
    }
}
