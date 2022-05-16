package com.solvd.cafe.models;

public class CurrenciesModel {
    private int id;
    private String name;

    public CurrenciesModel() {
    }

    public CurrenciesModel(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "CurrenciesModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
