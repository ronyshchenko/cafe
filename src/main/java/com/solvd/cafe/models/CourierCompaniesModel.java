package com.solvd.cafe.models;

import java.util.List;

public class CourierCompaniesModel {

    private int id;
    private String name;
    private String address;
    private String email;
    private String site;

    public CourierCompaniesModel() {
    }

    public CourierCompaniesModel(int id, String name, String address, String email, String site) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.site = site;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    @Override
    public String toString() {
        return "CourierCompaniesModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", site='" + site + '\'' +
                '}';
    }
}
