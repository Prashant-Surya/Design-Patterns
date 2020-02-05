package AdapterPattern;

public class SavingAccount extends Account {

    @Override
    protected void actualJob() {
        System.out.println("Savings job done");
    }
}