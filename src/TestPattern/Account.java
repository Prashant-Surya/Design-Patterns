package TestPattern;


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