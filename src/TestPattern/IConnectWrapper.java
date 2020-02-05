package TestPattern;

public class IConnectWrapper implements DB {
    IConnect iConnect;
    public IConnectWrapper(IConnect iConnect) {
        this.iConnect = iConnect;
    }
    @Override
    public void open() {
        iConnect.connect();
    }

    @Override
    public void close() {
        iConnect.disconnect();
    }
}
