package TestPattern;

public class Savings extends Account {
    @Override
    public void doJob() {
        System.out.println("Savings Job started");
        ui.showUI(this);
        System.out.println("Savings Job completed");
    }
}
