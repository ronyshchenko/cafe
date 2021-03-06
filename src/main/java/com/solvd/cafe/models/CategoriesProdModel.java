package com.solvd.cafe.models;

public class CategoriesProdModel {
    private int id;
    private String name;
    private String description;

    public CategoriesProdModel(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public CategoriesProdModel() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "CategoriesProdModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
