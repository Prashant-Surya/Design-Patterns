package AbstractFactoryPattern;

public class OraFactory implements IFactory {
    @Override
    public IConnection createConnections() {
        return new OraConnection();
    }

    @Override
    public ICommand createCommand() {
        return new OraCommand();
    }

    @Override
    public IAdapter createAdapter() {
        return new OraAdapter();
    }
}
