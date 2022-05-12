package com.solvd.cafe.models;

public class OrdersModel {

    private int id;
    private String date;
    private int custid;
    private int cashierid;
    private int prodid;
    private int quantity;
    private int courierid;

    public OrdersModel() {
    }

    public OrdersModel(int id, String date, int custid, int cashierid, int prodid, int quantity, int courierid) {
        this.id = id;
        this.date = date;
        this.custid = custid;
        this.cashierid = cashierid;
        this.prodid = prodid;
        this.quantity = quantity;
        this.courierid = courierid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCustid() {
        return custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    public int getCashierid() {
        return cashierid;
    }

    public void setCashierid(int cashierid) {
        this.cashierid = cashierid;
    }

    public int getProdid() {
        return prodid;
    }

    public void setProdid(int prodid) {
        this.prodid = prodid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCourierid() {
        return courierid;
    }

    public void setCourierid(int courierid) {
        this.courierid = courierid;
    }
}
