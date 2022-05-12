package com.solvd.cafe.models;

public class CouriersModel {

    private int id;
    private int companyid;
    private String name;
    private String phone;
    private String surname;

    public CouriersModel() {
    }

    public CouriersModel(int id, int companyid, String name, String phone, String surname) {
        this.id = id;
        this.companyid = companyid;
        this.name = name;
        this.phone = phone;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCompanyid() {
        return companyid;
    }

    public void setCompanyid(int companyid) {
        this.companyid = companyid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
