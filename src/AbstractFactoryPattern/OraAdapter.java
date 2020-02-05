package AbstractFactoryPattern;

public class OraAdapter implements IAdapter {
    @Override
    public void convert() {
        System.out.println("SQL Adapter converting...");
    }

    @Override
    public void getSchema() {
        System.out.println("SQL Adapter getting schema...");
    }
}
