package VisitorPattern;

public class ChristmasUI implements IUI {
    @Override
    public void showUI(Account account) {
        System.out.println("Christmas UI rendered for General");
    }

    @Override
    public void showUI(Savings account) {
        System.out.println("Christmas UI rendered for Savings");
    }

    @Override
    public void showUI(Current account) {
        System.out.println("Christmas UI rendered for Current");
    }

    @Override
    public void showUI(DMat account) {
        System.out.println("Christmas UI rendered for DMat");
    }
}
