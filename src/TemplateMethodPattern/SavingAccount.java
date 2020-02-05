package TemplateMethodPattern;

//public class SavingAccount {
//    public void doJob() {
//        System.out.println("Saving job done");
//    }
//}


/**
 * Violating SRP and DRY where we're using same DB operations on
 * both classes and also DB operations are being done in same class
 */
class SavingAccountExtra {
    public void doJob() {
        System.out.println("Open DB");
        System.out.println("Saving job done");
        System.out.println("Close DB");
    }
}


/**
 * Using DB Class to perform DB operations
 * Still has problems of injecting dependency
 */
class SavingAccountExtraDBFix {
    DB db = new DB();
    public void doJob() {
        db.open();
        System.out.println("Saving job done");
        db.close();
    }
}

/**
 * Fixed dependency injection by injecting any object from outside
 */
class SavingAccountExtraDBFixDI {

    DB db;
    public void setDb(DB db) {
        this.db = db;
    }

    public void doJob() {
        db.open();
        System.out.println("Saving job done");
        db.close();
    }
}

/**
 * Brought in a base class to fix DRY
 */
class SavingAccountDRYFIX extends AccountFirst {
    public void doJob() {
        this.db.open();
        System.out.println("Saving job done");
        this.db.close();
    }
}


/**
 * Fixed Open/Closed principle.
 */
public class SavingAccount extends Account {

    @Override
    protected void actualJob() {
        System.out.println("Savings job done");
    }
}