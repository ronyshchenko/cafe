package com.solvd.cafe.models;

public class ProductsModel {

    private int id;
    private int vendid;
    private String name;
    private float price;
    private String description;
    private int recipeid;
    private int categoryid;

    public ProductsModel() {
    }

    public ProductsModel(int id, int vendid, String name, float price, String description, int recipeid, int categoryid) {
        this.id = id;
        this.vendid = vendid;
        this.name = name;
        this.price = price;
        this.description = description;
        this.recipeid = recipeid;
        this.categoryid = categoryid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVendid() {
        return vendid;
    }

    public void setVendid(int vendid) {
        this.vendid = vendid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRecipeid() {
        return recipeid;
    }

    public void setRecipeid(int recipeid) {
        this.recipeid = recipeid;
    }

    public int getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    @Override
    public String toString() {
        return "ProductsModel{" +
                "id=" + id +
                ", vendid=" + vendid +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", recipeid=" + recipeid +
                ", categoryid=" + categoryid +
                '}';
    }
}
