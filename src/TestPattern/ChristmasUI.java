package TestPattern;

public class ChristmasUI implements IUI {
    @Override
    public void showUI(Account account) {
        String message = "Christmas UI rendered for ";
        if (account instanceof Savings) {
            message += "Savings";
        } else if (account instanceof Current) {
            message += "Current";
        } else if (account instanceof DMat) {
            message += "DMat";
        } else {
            message += "General";
        }
        System.out.println(message);
    }
}
