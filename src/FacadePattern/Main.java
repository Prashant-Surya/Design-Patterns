package FacadePattern;

public class Main {
    public static void main(String[] args) {
        BusinessLoan businessLoan = new BusinessLoan();
        businessLoan.initialCriterias();
        HomeLoan homeLoan = new HomeLoan();
        homeLoan.initialCriterias();
        System.out.println("Business loan can be processed: " + businessLoan.canBeProcessed());
        System.out.println("Home loan can be processed: " + homeLoan.canBeProcessed());
    }
}
