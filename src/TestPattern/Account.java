package TestPattern;

public abstract class Account {
    public abstract void doJob();

    public static IUI ui;
    public static void setUi(IUI par) {
        ui = par;
    }
}
