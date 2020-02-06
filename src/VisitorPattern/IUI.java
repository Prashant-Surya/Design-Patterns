package VisitorPattern;

public interface IUI {
    void showUI(Account account);
    void showUI(Savings account);
    void showUI(Current account);
    void showUI(DMat account);

}
