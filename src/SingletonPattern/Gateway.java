package SingletonPattern;

public class Gateway {
    private Gateway() {}
    private static Gateway _instance = null;

    public static Gateway getInstance() {
        if(_instance == null) {
            _instance = new Gateway();
        }
        return _instance;
    }

    public void doJob() {
        System.out.println("Gateway security verification");
    }

}
