package AbstractFactoryPattern;

public class OraConnection implements IConnection {
    @Override
    public void setConnection() {
        System.out.println("SQL Connection setting...");
    }

    @Override
    public void openConnection() {
        System.out.println("SQL Connection opening...");
    }
}
