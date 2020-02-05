package TemplateMethodPattern;


/*
Refer to SavingAccount class for more details.
 */


//public class CurrentAccount {
//    public void doJob() {
//        System.out.println("Current job done");
//    }
//}

/**
 * Using DB Class to perform DB operations
 */
class CurrentAccountExtraDBFix {
    DB db = new DB();
    public void doJob() {
        db.open();
        System.out.println("Saving job done");
        db.close();
    }
}

public class CurrentAccount extends Account{

    @Override
    protected void actualJob() {
        System.out.println("Current job");
    }
}