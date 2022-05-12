package com.solvd.cafe.models;

public abstract class PaimentsModel {

    private int id;
    private int invoiceid;
    private int currencyid;
    private int accountantid;
    private int volumefact;
    private int debt;

    public PaimentsModel() {
    }

    public PaimentsModel(int id, int invoiceid, int currencyid, int accountantid, int volumefact, int debt) {
        this.id = id;
        this.invoiceid = invoiceid;
        this.currencyid = currencyid;
        this.accountantid = accountantid;
        this.volumefact = volumefact;
        this.debt = debt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInvoiceid() {
        return invoiceid;
    }

    public void setInvoiceid(int invoiceid) {
        this.invoiceid = invoiceid;
    }

    public int getCurrencyid() {
        return currencyid;
    }

    public void setCurrencyid(int currencyid) {
        this.currencyid = currencyid;
    }

    public int getAccountantid() {
        return accountantid;
    }

    public void setAccountantid(int accountantid) {
        this.accountantid = accountantid;
    }

    public int getVolumefact() {
        return volumefact;
    }

    public void setVolumefact(int volumefact) {
        this.volumefact = volumefact;
    }

    public int getDebt() {
        return debt;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }
}
