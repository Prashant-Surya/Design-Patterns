package AbstractFactoryPattern;

public class SQLFactory implements IFactory {
    @Override
    public IConnection createConnections() {
        return new SqlConnection();
    }

    @Override
    public ICommand createCommand() {
        return new SqlCommand();
    }

    @Override
    public IAdapter createAdapter() {
        return new SqlAdapter();
    }
}
