package TemplateMethodPattern;

/**
 * Moving common responsibilites to a common class
 * Fabrication
 */
abstract  class AccountFirst {
    DB db = null;

    public void setDb(DB db) {
        this.db = db;
    }
}


/**
 * Fixing Open/Closed principle as the operation is still
 * at different places.
 */
public abstract  class Account {
    DB db = null;

    public void setDb(DB db) {
        this.db = db;
    }

    protected abstract void actualJob();
    public void doJob() {
        this.db.open();
        this.actualJob();
        this.db.close();
    }

}