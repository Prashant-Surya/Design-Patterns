package TestPattern;

public class Main {
    public static void main(String[] args){
        Account.setUi(new ChristmasUI());

        Savings savings = new Savings();
        Current current = new Current();
        DMat dMat       = new DMat();

        savings.doJob();
        System.out.println("------------------------");
        current.doJob();
        System.out.println("------------------------");
        dMat.doJob();

    }
}
