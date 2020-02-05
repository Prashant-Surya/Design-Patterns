package AbstractFactoryPattern;

public class OraCommand implements ICommand {
    @Override
    public void attach() {
        System.out.println("SQL Command attaching...");
    }

    @Override
    public void execute() {
        System.out.println("SQL Command executing...");
    }
}
