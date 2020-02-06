package SingletonPattern;

public class Main {
    public static void main(String[] args) {
        Gateway gateway = Gateway.getInstance();
        gateway.doJob();
        Gateway gateway2 = Gateway.getInstance();
        if (gateway == gateway2) {
            System.out.println("Singleton success");
        }
    }
}
