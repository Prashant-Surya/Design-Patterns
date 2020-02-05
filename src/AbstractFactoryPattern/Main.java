package AbstractFactoryPattern;

public class Main {
    public static void main(String[] args){
//        IConnection cnn = new SqlConnection();
//        cnn.setConnection();
//        cnn.openConnection();
//        ICommand cmd = new SqlCommand();
//        cmd.attach();
//        cmd.execute();
//        IAdapter adapter = new SqlAdapter();
//        adapter.convert();
//        adapter.getSchema();
        // Use just factory to get all these objects
        IFactory factory = new SQLFactory();
        IConnection connection = factory.createConnections();
        connection.setConnection();
        connection.openConnection();

    }
}
