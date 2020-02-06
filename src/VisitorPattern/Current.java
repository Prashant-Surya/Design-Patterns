package VisitorPattern;

public class Current extends Account {
    @Override
    public void doJob() {
        System.out.println("Current Job started");
        ui.showUI(this);
        System.out.println("Current Job completed");
    }
}
