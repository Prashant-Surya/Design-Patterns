package AdapterPattern;

public class CurrentAccount extends Account {

    @Override
    protected void actualJob() {
        System.out.println("Current job");
    }
}