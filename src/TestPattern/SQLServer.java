package TestPattern;

public class SQLServer implements DB {
    @Override
    public void open() {
        System.out.println("Opened SQL DB");
    }

    @Override
    public void close() {
        System.out.println("Closed SQL DB");
    }
}
