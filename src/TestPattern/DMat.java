package TestPattern;

public class DMat extends Account {
    @Override
    public void doJob() {
        System.out.println("DMat Job started");
        ui.showUI(this);
        System.out.println("DMat Job completed");
    }
}
