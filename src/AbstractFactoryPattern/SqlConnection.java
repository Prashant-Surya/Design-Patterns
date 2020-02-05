package AbstractFactoryPattern;

public class SqlConnection implements IConnection {
    @Override
    public void setConnection() {
        System.out.println("SQL Connection setting...");
    }

    @Override
    public void openConnection() {
        System.out.println("SQL Connection opening...");
    }
}
