package AbstractFactoryPattern;

public interface IFactory {
    IConnection createConnections();
    ICommand createCommand();
    IAdapter createAdapter();
}
