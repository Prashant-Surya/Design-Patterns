package FactoryMethodPattern;

public abstract  class Account {

    protected abstract void actualJob();
    protected abstract ITax getTax();
    public void doJob(){
        ITax iTax = getTax();
        iTax.calculate();
        this.actualJob();
    }

}